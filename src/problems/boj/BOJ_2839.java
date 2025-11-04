package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2839 {

    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] visited = new int[5001];
        Arrays.fill(visited, -1);
        visited[3] = 1;
        visited[5] = 1;
        visited[4] = 1;

        int pointer = 6;
        while(pointer <= n){
            if(visited[pointer - 5] != -1 ) visited[pointer] = visited[pointer-5] +1;
            else if(visited[pointer - 4] != -1 ) visited[pointer] = visited[pointer-4] +1;
            else if(visited[pointer - 3] != -1 ) visited[pointer] = visited[pointer-3] +1;
            
            pointer++;
        }

        System.out.println(visited[n]);
        
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2839().solve();
    }
}
