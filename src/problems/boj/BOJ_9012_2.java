package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_9012_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for(int i=0; i< t; i++){
            String s = reader.readLine();
            System.out.println(isValidP(s) ? "YES": "NO");
        }
    }

    public static boolean isValidP(String s){
        char[] chars = s.toCharArray();
        int buff = 0;
        for(char c : chars){
            if(c == '(') buff++;
            else buff--;

            if(buff < 0) return false;
        }

        if(buff == 0) return true;
        
        return false;
    }

    public static void main(String[] args) throws IOException {
        new BOJ_9012_2().solve();
    }
}
