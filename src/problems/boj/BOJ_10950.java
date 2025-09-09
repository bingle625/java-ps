package problems.boj;

import java.util.Scanner;

public class BOJ_10950 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
    }

    public static void main(String[] args) {
        new BOJ_10950().solve();
    }
}
