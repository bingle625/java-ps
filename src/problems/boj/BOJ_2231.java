package problems.boj;

import java.io.*;

public class BOJ_2231 {

    public static int decompositionSum(int i){
        String text = String.valueOf(i);

        char[] texts = text.toCharArray();
        int sum = i;
        for(int k=0; k < texts.length; k++){
            sum += Character.getNumericValue(texts[k]);
        }
        
        return sum;
    }
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        int n = Integer.parseInt(line);

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(decompositionSum(i) == n){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2231().solve();
    }
}
