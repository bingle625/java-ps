package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_3052_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            map.put(number % 42, map.getOrDefault(number % 42, 0) + 1);
        }
        

        System.out.println(map.size());
    }

    public static void main(String[] args) throws IOException {
        new BOJ_3052_2().solve();
    }
}
s