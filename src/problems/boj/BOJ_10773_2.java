package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10773_2 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input != 0){
                stack.addFirst(input);
            }else{
                stack.pollFirst();   
            }
        }

        int sum=0;
        while(!stack.isEmpty()){
            sum += stack.pollFirst();
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_10773_2().solve();
    }
}
