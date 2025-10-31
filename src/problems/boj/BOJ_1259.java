package problems.boj;

import java.io.*;

public class BOJ_1259 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line = reader.readLine();
            if(line.equals("0")) break;

            char[] chars = line.toCharArray();
            
            if(isPalindrome(chars)) System.out.println("yes");
            else System.out.println("no");
        }
    }

    public static boolean isPalindrome(char[] chars){
        int left = 0;
        int right = chars.length-1;
        while(left <= right){
            if(chars[left++] != chars[right--]) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1259().solve();
    }
}
