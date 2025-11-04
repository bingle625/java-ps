package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1181_3 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        String[] sArr = new String[n];
        for(int i=0; i<n; i++){
            sArr[i] = reader.readLine();
        }

        Arrays.sort(sArr, (a, b)-> {
            if(a.length() == b.length()) return a.compareTo(b);
            
            return a.length() - b.length();
        });

        StringBuilder sb = new StringBuilder();

        HashSet<String> visited = new HashSet<>();
        for(String s : sArr){
            if(!visited.contains(s)){
                sb.append(s + "\n");
                visited.add(s);
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1181_3().solve();
    }
}
