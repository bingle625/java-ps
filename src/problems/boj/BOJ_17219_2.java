package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_17219_2 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = numbers[0];
        int m = numbers[1];

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] inputs = br.readLine().split(" ");
            map.put(inputs[0], inputs[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            String password = map.get(br.readLine());
            sb.append(password + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_17219_2().solve();
    }
}
