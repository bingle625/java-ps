package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1018 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        char[][] boards = new char[n][m];
        for(int i=0; i<n; i++){
            boards[i] = reader.readLine().toCharArray();
        }

        int min = 100;
        for(int left=0; left+8-1 < m; left++){
            for(int top=0; top+8-1 < n; top ++){
                char[][] inputBoards = new char[8][8];

                for(int i=0; i<8; i++){
                    for(int j=0; j < 8; j++){
                        inputBoards[i][j] = boards[top+i][left+j];
                    }
                }

                min = Integer.min(getMinChangeCount(inputBoards), min);
            }
        }

        System.out.println(min);
    }

    public static int getMinChangeCount(char[][] inputBoards){

        char[][] lines = new char[2][8];
        lines[0] = "WBWBWBWB".toCharArray();
        lines[1] = "BWBWBWBW".toCharArray();

        int a = 0;
        int b = 0;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(inputBoards[i][j] != lines[i%2][j]) a++;
                if(inputBoards[i][j] != lines[(i+1)%2][j]) b++;
            }
        }


        return Integer.min(a,b);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1018().solve();
    }
}
