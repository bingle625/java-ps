package problems.boj;

import java.io.*;

public class BOJ_25083 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();
        s.append("         ,r'\"7\n");
        s.append("r`-_   ,'  ,/");
        s.append("\n");
        s.append(" \\. \". L_r'");
        s.append("\n");
        s.append("   `~\\/");
        s.append("\n");
        s.append("      |");
        s.append("\n");
        s.append("      |");
        System.out.println(s);        // 디버깅 출력 (문제에 맞게 수정)
        // 문제 해결 코드 작성
    }

    public static void main(String[] args) throws IOException {
        new BOJ_25083().solve();
    }
}
