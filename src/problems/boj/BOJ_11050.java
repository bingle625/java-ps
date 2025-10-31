package problems.boj;

import java.io.*;

public class BOJ_11050 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] ss = line.split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);


        if(k == 0){
            System.out.println(1);
            return;
        }

        int divided = 1;
        for (int i = 0; i < k; i++) {
            divided *= n-i;
        }

        int divider = 1;
        for (int i = 0; i < k; i++) {
           divider *= i+1; 
        }

        System.out.println(divided / divider);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_11050().solve();
    }
}
