package problems.boj;

import java.util.Scanner;

public class BOJ_2739 {
	public void solve() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            builder.append(String.format("%d * %d = %d", n, i, n * i)).append("\n");
		}

        System.out.print(builder);
	}

	public static void main(String[] args) {
		new BOJ_2739().solve();
	}
}
