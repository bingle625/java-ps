package problems.boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10871 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] s = firstLine.split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);

        String[] s1 = secondLine.split(" ");
        int[] numbers = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (numbers[i] < x) {
                result.append(numbers[i]).append(" ");
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        new BOJ_10871().solve();
    }
}

