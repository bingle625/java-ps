package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1181_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line);
        
        Set<String> stringSet = new HashSet<String>();
        for(int i=0; i< n; i++){
            stringSet.add(reader.readLine());
        }
        String[] strings = stringSet.toArray(new String[0]);

        Arrays.sort(strings, new Comparator<String>(){
            public int compare(String a, String b){
                if(a.length() != b.length()) return a.length() - b.length();

                return a.compareTo(b);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(String string : strings){
            stringBuilder.append(string + "\n");
        }

        System.out.println(stringBuilder);
        
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1181_2().solve();
    }
}
