package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1764 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);
        Map<String, Integer> visitedMap = new HashMap<String, Integer>();
        List<String> names = new ArrayList<String>();

        for(int i=0; i<n; i++){
            String name = br.readLine();
            visitedMap.put(name, 1);
        }

        for(int i=0; i<m; i++){
            String name2 = br.readLine();
            if(visitedMap.getOrDefault(name2, 0) == 1){
                names.add(name2);
            }
        }

        String[] namesArr = names.toArray(new String[0]);
        Arrays.sort(namesArr, (a, b)-> a.compareTo(b));

        StringBuilder sb = new StringBuilder();
        int size = namesArr.length;
        sb.append(size +"\n");
        for(int i=0; i<size; i++){
            sb.append(namesArr[i] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1764().solve();
    }
}
