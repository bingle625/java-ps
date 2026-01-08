package problems.boj;

import java.io.*;

public class BOJ_15829 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // 26 * (2^5-1) * (2^5-1)
        // int 는 2의 31 -1, long은 2의 63 승 -1
        int l = Integer.parseInt(reader.readLine());
        String s = reader.readLine();

        long result = 0;
        long power = 1;
        for(int i=0; i<l; i++){
            result += (s.charAt(i) - 'a' +1) * (power) ;

            power *= 31;
            power %= 1234567891;
        }
        result %= 1234567891;

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_15829().solve();
    }
}
