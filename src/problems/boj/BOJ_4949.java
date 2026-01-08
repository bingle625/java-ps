package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_4949 {
    public void solve() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = reader.readLine();
            if(".".equals(s)) break;

            Deque<Character> stack = new ArrayDeque<Character>();

            boolean isBalanced = true;
            for(int i=0; i<s.length(); i++){
                Character c = s.charAt(i);
                if(c == '(' || c == '[' ){
                    stack.addFirst(c);
                }else if(c == ')' || c == ']' ){
                    Character v = stack.pollFirst();
                    if( v == null || !matchPar(v , c)){
                        isBalanced = false;
                        break;
                    }
                }
            }

            if(isBalanced && stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }
    }

    public static boolean matchPar(Character left, Character right){
        if(left == '(') return right == ')';
        else return right == ']';
    }

    public static void main(String[] args) throws IOException {
        new BOJ_4949().solve();
    }
}
