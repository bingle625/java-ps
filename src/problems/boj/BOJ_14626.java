package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_14626 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        boolean isTriple = false;
        boolean resultIsTriple = false;
        int m = s.charAt(12) - '0';
        int sum = 0;
        for(int i=0; i<12; i++){
            
            char character = s.charAt(i);
            if(s.charAt(i) == '*'){
                resultIsTriple = isTriple;
            }else{
                sum += (character - '0') * (isTriple ? 3 : 1);
            }
            isTriple = !isTriple;
        }

        int pow = resultIsTriple ? 3 : 1;
        for(int i=0; i<10; i++){
            if((m+sum+i*pow) % 10 == 0){
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_14626().solve();
    }
}
