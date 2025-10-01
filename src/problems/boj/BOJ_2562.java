package problems.boj;

import java.io.*;

public class BOJ_2562 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int pos = 1;
        for(int i=0; i< 9; i++){
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            if(n>max){
                max = n;
                pos = i+1;
            }
        }

        System.out.println(max);
        System.out.println(pos);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2562().solve();
    }
}
