package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_17219 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int n= Integer.parseInt(numbers[0]);
        int m= Integer.parseInt(numbers[1]);

        Map<String, String> sMap = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] sitePass = br.readLine().split(" ");
            sMap.put(sitePass[0], sitePass[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            String key = br.readLine();
            sb.append(sMap.get(key) + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_17219().solve();
    }
}
