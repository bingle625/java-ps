package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1978_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();

        int n = Integer.parseInt(line);
        int[] numbers = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int max = -1;
        for(int i : numbers) max = Integer.max(i, max);

        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            primes.add(i);
        }

        int targetPrime = 2;
        while (true) {
            for (int i = 0; i < primes.size(); i++){
                if(i % targetPrime == 0) primes.remove(i);
            }
            targetPrime = primes.get(1);
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1978_2().solve();
    }
}
