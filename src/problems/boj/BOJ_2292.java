package problems.boj;

import java.io.*;

public class BOJ_2292 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line);

        if(n == 1){
            System.out.println(1);
            return;
        }
        
        int left=2;
        for(int i=1; i*6 <=1000000000; i++){
            if(n >= left && n < left + i*6){
                System.out.println(i+1);
                break;
            }

            left += i*6;
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2292().solve();
    }
}
