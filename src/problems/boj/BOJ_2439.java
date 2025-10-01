package problems.boj;

import java.io.*;

public class BOJ_2439 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);

        StringBuilder builder = new StringBuilder();
        for(int i=0; i<n; i++){
            int sn = i+1;
            int space = n-sn;
            builder.append(" ".repeat(space) + "*".repeat(sn));

            if(i!=n-1){
                builder.append("\n");
            }
        }

        System.out.println(builder);
    }

    public static void main(String[] args) throws IOException {
        
        new BOJ_2439().solve();
    }
}
