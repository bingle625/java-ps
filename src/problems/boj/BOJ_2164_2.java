package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2164_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Integer[] numberArr = new Integer[n];
        for(int i=0; i<n; i++){
            numberArr[i] = i+1;
        }

        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(numberArr));

        Integer result = n;
        while(!deque.isEmpty()){
            result = deque.pollFirst();
            if(deque.isEmpty()){
                System.out.println(result);
                return;
            }
            deque.offerLast(deque.pollFirst());
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2164_2().solve();
    }
}
