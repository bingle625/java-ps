package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_9012_3 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-- > 0){
            char[] sArr = reader.readLine().toCharArray();

            int vpsStatus = 0;
            boolean success = true;
            for(char c : sArr){
                if(c == '(') vpsStatus++;
                else vpsStatus--;

                if(vpsStatus < 0 ){
                    success = false;
                    break;
                }
            }
            if( vpsStatus != 0 || !success) System.out.println("NO");
            else System.out.println("YES");
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_9012_3().solve();
    }
}
