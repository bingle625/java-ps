package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2164 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        
        Integer result = 1;
        Integer t;
        while(!queue.isEmpty()){
            result = queue.remove();
            t = queue.poll();
            if(t == null) break;
            queue.add(t);
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2164().solve();
    }
}
