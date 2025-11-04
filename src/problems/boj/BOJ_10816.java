package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10816 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int number : numbers){
            Integer key = Integer.valueOf(number);
            Integer value = map.getOrDefault(key, 0);
            map.put(key, value+1);
        }

        int m = Integer.parseInt(reader.readLine());

        int[] numbers2 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        for(int number : numbers2){
            Integer key = Integer.valueOf(number);
            sb.append(map.getOrDefault(key, 0) + " ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10816().solve();
    }
}
