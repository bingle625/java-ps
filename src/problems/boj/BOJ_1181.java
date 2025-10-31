package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1181 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line);
        
        HashMap<Integer, Set<String>> map = new HashMap<Integer, Set<String>>();
        
        for (int i = 0; i < n; i++) {
            String line1 = reader.readLine();
            Set<String> list = map.getOrDefault(line1.length(), new HashSet<>());
            list.add(line1);
            map.put(line1.length(), list);
        }

        Integer[] lengths = map.keySet().toArray(new Integer[map.size()]);
        Arrays.sort(lengths);
        
        for(int i=0; i< lengths.length; i++){
            Set<String> list = map.get(lengths[i]);
            String[] strings = list.toArray(new String[0]);
            Arrays.sort(strings);
            for (String string : strings) {
             System.out.println(string);   
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1181().solve();
    }
}
