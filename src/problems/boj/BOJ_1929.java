package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1929 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = inputs[0];
        int b = inputs[1];
        int max = Integer.max(a, b);
        int[] numbers = new int[1_000_001];
        Arrays.fill(numbers, 1); // 0은 소수 아님, 1은 소수
        numbers[2] = 1;
        numbers[3] = 1;
        for(int i =2; i<= max; i++){
            if(numbers[i] == 1){
                for(int j = i*2; j <= max; j+= i){
                    numbers[j] = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=a; i<=b; i++){
            if(numbers[i] == 1){
                sb.append(i);
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1929().solve();
    }
}
