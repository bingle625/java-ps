package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2798 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();

        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = numbers[0];
        int m = numbers[1];

        int[] cardNums = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();

        int size = cardNums.length;

        int nearMax = -1;
        for(int i=0; i < size-2; i++){
            for(int j=i+1; j < size-1; j++){
                for(int k=j+1; k < size; k++){
                    int compare = cardNums[i] + cardNums[j] +cardNums[k];
                    if(compare > nearMax && compare <= m) nearMax = compare;
                }
            }
        }

        System.out.println(nearMax);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2798().solve();
    }
}
