package problems.boj;

import java.util.Scanner;

public class BOJ_2741 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            builder.append(i).append("\n");
        }

        System.out.println(builder);
    }

    public static void main(String[] args) {
        new BOJ_2741().solve();
    }
}
