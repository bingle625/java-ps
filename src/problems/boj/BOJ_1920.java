package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1920 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Integer[] nArr = Arrays.stream(reader.readLine().split(" ")).map(s-> Integer.parseInt(s)).toArray(Integer[]::new);
        int m = Integer.parseInt(reader.readLine());
        int[] mArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashSet<Integer> set = new HashSet<Integer>(List.of(nArr));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mArr.length; i++) {
            if(set.contains(mArr[i])){
                sb.append(1);
            }else{
                sb.append(0);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1920().solve();
    }
}
