package problems.boj;

import java.io.*;

public class BOJ_3052 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            numbers[i] = Integer.parseInt(line) % 42;
        }

        int[] visitedNumbers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for (int i = 0; i < numbers.length; i++) {
            for(int k=0; k< visitedNumbers.length; k++){
               if(visitedNumbers[k] == -1){
                visitedNumbers[k] = numbers[i];
                break;
               }

               if(numbers[i] == visitedNumbers[k]) break;
            }
        }

        int result = 0;
        for (int i = 0; i < visitedNumbers.length; i++) {
            if(visitedNumbers[i] != -1) result++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_3052().solve();
    }
}
