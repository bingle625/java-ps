package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_28702 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int next = -1;
        for(int i=0; i<3; i++){
            String s = reader.readLine();

            if(!(s.equals("Fizz") || s.equals("Buzz") || s.equals("FizzBuzz"))){
                next = Integer.parseInt(s) + (3-i);
            }
        }

        System.out.println(getBlah(next));
    }

    public static String getBlah(int number){
        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if(number % 3 == 0) return "Fizz";
        if(number % 5 == 0) return "Buzz";
        
        return number + "";
    }

    public static void main(String[] args) throws IOException {
        new BOJ_28702().solve();
    }
}
