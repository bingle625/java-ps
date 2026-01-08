package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1436 {
    public void solve() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        int i=0;
        int pointer = 666;
        while(true){
            if((pointer + "").contains("666")){
                if(++i == n) break;
            };
            pointer++;
        }
        System.out.println(pointer);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1436().solve();
    }
}
