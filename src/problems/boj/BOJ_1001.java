package problems.boj;

import java.util.Scanner;

public class BOJ_1001 {
	public void solve() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();

		int a = Integer.parseInt(string.substring(0, 1));
		int b = Integer.parseInt(string.substring(2, 3));

		System.out.println(a - b);
	}

	public static void main(String[] args) {
		new BOJ_1001().solve();
	}
}
