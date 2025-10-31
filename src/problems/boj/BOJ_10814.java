package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10814 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line);

        Map<Integer, List<String>> ageMap = new HashMap<Integer, List<String>>();

        for (int i = 0; i < n; i++) {
            String[] line2 = reader.readLine().split(" ");
            Integer age = Integer.parseInt(line2[0]);
            String name = line2[1];
            List<String> names = ageMap.getOrDefault(age, new ArrayList<String>());
            names.add(name);
            ageMap.put(age, names);
        }

        Integer[] keys = ageMap.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);

        StringBuilder sb = new StringBuilder();
        for (Integer age : keys) {
            List<String> names = ageMap.get(age);
            
            names.forEach(s -> sb.append(age + " " + s + "\n"));
        }

        System.out.println(sb);
     
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10814().solve();
    }
}
