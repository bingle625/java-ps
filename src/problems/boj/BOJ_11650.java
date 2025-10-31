package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_11650 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        for(int i=0; i< n; i++){
            int[] points = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            List<Integer> ys = map.getOrDefault(points[0], new ArrayList<Integer>());
            ys.add(points[1]);
            map.put(points[0], ys);
        }

        Integer[] keys = map.keySet().toArray(new Integer[0]);

        Arrays.sort(keys);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < keys.length; i++) {
            Integer[] ys = map.get(keys[i]).toArray(new Integer[0]);
            Arrays.sort(ys);

            for (int j = 0; j < ys.length; j++) {
                sb.append(keys[i] + " " + ys[j] + "\n");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_11650().solve();
    }
}
