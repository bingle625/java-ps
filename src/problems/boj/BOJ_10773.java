package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10773  {
    
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<k; i++){
            int number = Integer.parseInt(reader.readLine());
            if(number != 0) stack.addFirst(number);
            else stack.removeFirst();
        }
        
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.removeFirst();
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10773().solve();
    }
}
