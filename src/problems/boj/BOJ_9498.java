package problems.boj;

import java.util.Scanner;

public class BOJ_9498 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        char result = getGrade(i);

        System.out.println(result);
    }

    private char getGrade(int i) {
        if (i <= 100 && i > 89) {
            return 'A';
        } else if (i <= 89 && i > 79) {
            return 'B';
        } else if (i <= 79 && i > 69) {
            return 'C';
        } else if (i <= 69 && i > 59) {
            return 'D';
        }

        return 'F';
    }

    public static void main(String[] args) {
        new BOJ_9498().solve();
    }
}
