package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1152 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String[] words;
        if(text.equals(" ")) {
            words = new String[]{};
        }else{
            words = text.trim().split(" ");
        }

        System.out.println(words.length);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1152().solve();
    }
}
