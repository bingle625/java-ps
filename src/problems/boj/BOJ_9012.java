package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_9012 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for(int i =0; i<t; i++){
            String s = reader.readLine();
            Deque<Integer> stack = new ArrayDeque<>();

            char[] chars = s.toCharArray();
            
            boolean valid = true;
            for(char character : chars){
                if(character == '(') stack.addFirst(1);
                else if(!stack.isEmpty()) stack.removeFirst();
                else{
                    valid = false;
                    break;
                }
            }

            System.out.println(valid && stack.isEmpty() ? "YES" : "NO");
        }
        
    }

    public static void main(String[] args) throws IOException {
        new BOJ_9012().solve();
    }
}
