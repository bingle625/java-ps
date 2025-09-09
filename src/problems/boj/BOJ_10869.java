package problems.boj;

import java.util.Scanner;

public class BOJ_10869 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);

        System.out.println(
            (a+b) + "\n"
            + (a-b) + "\n"
            + (a*b) + "\n"
            + (a/b) + "\n"
            + (a%b) + "\n"
        );
    }

    public static void main(String[] args) {
        new BOJ_10869().solve();
    }
}
