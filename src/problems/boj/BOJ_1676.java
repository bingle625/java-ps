package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1676 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(reader.readLine());


        int result = 1;
        int cnt = 0;
        // 2, 5로 나누기 해서 개수 구하면 될거 같기는 하다.
        int[] tando = {0, 0};

        for(int i=1; i<=n; i++){
            int c = i;
            while(c % 2 == 0){
                tando[0]++;
                c /= 2;
            }

            while(c % 5 == 0){
                tando[1]++;
                c /= 5;
            }
        }

        // System.out.println(tando[0]);
        // System.out.println(tando[1]);

        System.out.println(Integer.min(tando[0], tando[1]));
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1676().solve();
    }
}
