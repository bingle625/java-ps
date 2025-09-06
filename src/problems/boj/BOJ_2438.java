package problems.boj;

import java.util.Scanner;

public class BOJ_2438 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            String s = "";
            for (int k = 0; k < j + 1; k++) {
                s += "*";
            }
            builder.append(s).append("\n");
        }

        System.out.println(builder);
    }

    public static void main(String[] args) {
        new BOJ_2438().solve();
    }
}
