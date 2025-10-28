package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1978 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();

        int n = Integer.parseInt(line);

        int[] numbers = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> primes = new ArrayList<>();

        int maxNum = -1;
        for (int i = 0; i < numbers.length; i++) {
            maxNum = Integer.max(numbers[i], maxNum);
        }

        primes.add(2);

        for (int i = 3; i <= maxNum; i++) {
            boolean isPrime = true;
            int size = primes.size();
            for (int k=0; k<size; k++) {
                if(i % primes.get(k) == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
        }

        Set<Integer> set2 = Set.copyOf(primes);

        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(set2.contains(numbers[i])) cnt++;
        }

        System.out.println(cnt);
        // 문제 해결 코드 작성
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1978().solve();
    }
}
