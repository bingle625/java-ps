package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10828 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String[] pair = reader.readLine().split(" ");
            int result = execCommand(pair[0], pair.length == 2 ?  Integer.valueOf(pair[1]) : null, stack);
            if(result != -2){
                System.out.println(result);
            }
        }
        System.out.println(sb);
    }

    public static int execCommand(String command, Integer value, Deque<Integer> stack){
        switch(command){
                case "push":
                    stack.addFirst(value);
                    return -2;
                case "pop":
                    Integer a = stack.pollFirst();
                    if(a==null) return -1;
                    return a;
                case "size":
                    return stack.size();
                case "empty":
                    return stack.isEmpty() ? 1 : 0;
                case "top":
                    Integer top = stack.peekFirst();
                    if(top==null) top = -1;
                    return top;
                default:
                    return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10828().solve();
    }
}
