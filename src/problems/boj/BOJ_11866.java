package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_11866 {
    
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int n = N;
        int x;
        List<Integer> result = new ArrayList<>();
        List<Integer> peoples = new ArrayList<>();
        for(int i=1; i<N+1; i++){
            peoples.add(i);
        }
        
        int pointer = 0;
        int nextTarget = pointer + k -1;
        while(n > 0){
            if(nextTarget >= n) nextTarget = nextTarget % n;
            result.add(Integer.valueOf(peoples.get(nextTarget)));
            peoples.remove(nextTarget);

            nextTarget = nextTarget + k-1;
            n--;
        }

        Integer[] resultArr = result.toArray(new Integer[0]);
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=0; i < N; i++){
            sb.append(resultArr[i]);
            
            if(i != N-1) sb.append(", ");
        }
        sb.append(">");

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_11866().solve();
    }
}
