package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_11720 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        int result = 0;
        for(int j=0; j<i; j++){
            result += Character.getNumericValue(chars[j]);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        new BOJ_11720().solve();
    }
}
