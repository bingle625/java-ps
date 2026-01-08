package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1874 {
    public void solve() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] visited = new int[n+1];
        Arrays.fill(visited, 0);
        visited[0] = 1;

        Deque<Integer> stack = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< n; i++){
            Integer target = Integer.parseInt(reader.readLine());
            Integer top = stack.peekFirst();
            if(top == null || top < target){
                int init = 0;
                if(top != null) init = top;
                for(int j=init+1; j<= target; j++){
                    if(visited[j] == 0){
                        sb.append("+" + "\n");
                        stack.push(j);
                    }
                }
                sb.append("-"+"\n");
                Integer number = stack.pop();
                visited[number] =1;
            }else if(target.equals(top)){
                sb.append("-"+"\n");
                Integer number = stack.pop();
                visited[number] =1;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1874().solve();
    }
}
