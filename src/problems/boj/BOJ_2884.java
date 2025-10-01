package problems.boj;

import java.util.Scanner;

public class BOJ_2884 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        boolean flag = (m-45 < 0);

        if(flag) h -= 1;
        h = (h+24) % 24;

        m = (m - 45 + 60) % 60;

        System.out.println(h+ " " + m);
    }

    public static void main(String[] args) {
        new BOJ_2884().solve();
    }
}
