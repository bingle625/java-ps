package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10818 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] numbers = reader.readLine().split(" ");

        int max = -1000001;
        int min = 1000001;
        for (int i = 0; i < numbers.length; i++) {
            int target = Integer.parseInt(numbers[i]);
            
            if(max <= target) max = target;
            if(min >= target) min = target;
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10818().solve();
    }
}
