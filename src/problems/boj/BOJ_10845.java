package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_10845 {
    
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] s;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for(int i=0; i<n; i++){
            s = reader.readLine().split(" ");

            switch(s[0]){
                case "push":
                    queue.offerLast(Integer.valueOf(s[1]));
                    break;
                case "pop":
                    Integer poped = queue.pollFirst();
                    System.out.println(poped != null ? poped : "-1");
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    Integer peeked = queue.peekFirst();
                    System.out.println(peeked != null ? peeked : "-1");
                    break;
                case "back":
                    Integer peekedLast = queue.peekLast();
                    System.out.println(peekedLast != null ? peekedLast : "-1");
                    break;
            }
            
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10845().solve();
    }
}
