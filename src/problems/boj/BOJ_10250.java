package problems.boj;

import java.io.*;

public class BOJ_10250 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = reader.readLine().split(" ");
            int h = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);

            // h는 0 더해줘야함 나중에
            int[] chargedByFloor = new int[h];
            
            String result = "101";
            for(int j=0; j<n; j++){
                int min = 100;
                int pos = 0;
                for(int k=0; k<h; k++){
                    if(chargedByFloor[k] < min){
                        min = chargedByFloor[k];
                        pos = k;
                    }
                }
                chargedByFloor[pos] += 1;

                result = (pos+1) + (chargedByFloor[pos] >= 10 ? chargedByFloor[pos] +"" : "0"+ chargedByFloor[pos]);
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10250().solve();
    }
}
