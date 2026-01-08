package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1978_4 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] integers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = new int[1001];
        
        Arrays.fill(numbers, 1);
        numbers[1] = -1;
        numbers[2] = 1;
        for(int i=1; i<=1000; i++){
            if(numbers[i] == 1){
                for(int j= i*2; j < 1001; j += i){
                    numbers[j] = -1;
                }
            }
        }

        int cnt=0;
        for(int i: integers){
            if(numbers[i] == 1) cnt++;
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1978_4().solve();
    }
}
