package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_10814_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashMap<Integer, List<String>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String[] ss = reader.readLine().split(" ");
            Integer age = Integer.valueOf(ss[0]);
            String name = ss[1];
            List<String> names = map.getOrDefault(age, new ArrayList<String>());
            names.add(name);
            map.put(age, names);
        }

        Integer[] ageKeys = map.keySet().toArray(new Integer[0]);
        Arrays.sort(ageKeys);

        StringBuilder sb = new StringBuilder();
        for(Integer age : ageKeys){
            List<String> names = map.get(age);
            for(String name2 : names){
                sb.append(age + " ");
                sb.append(name2 + " ");
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10814_2().solve();
    }
}
