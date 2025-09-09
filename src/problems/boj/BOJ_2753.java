package problems.boj;

import java.util.Scanner;

public class BOJ_2753 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int result = 0;
        if (isYoon(i)) {
            result = 1;
        }

        // System.out.println(isYoon(4));
        // System.out.println(isYoon(100));
        // System.out.println(isYoon(400));
        // System.out.println(isYoon(1900));
        // System.out.println(isYoon(4000));

        System.out.println(result);
    }

    private static boolean isYoon(int i) {
        return (i % 4 == 0) && (i % 400 == 0 || i % 100 != 0);
    }

    public static void main(String[] args) {
        new BOJ_2753().solve();
    }
}
