package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2606_2 {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static boolean[] visited;
    static int count = 0;

    public void dfs(Integer number){
        visited[number] = true;

        for(Integer next: graph.getOrDefault(number, List.of())){
            if(!visited[next]){
                count++;
                dfs(next);
            }
        }
    }

    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());
        
        visited = new boolean[n+1];
        Arrays.fill(visited, false);
        
        for(int i=0; i<v; i++){
            Integer[] numbers = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
            List<Integer> injac1 = graph.getOrDefault(numbers[0], new ArrayList<>());
            injac1.add(numbers[1]);
            graph.put(numbers[0], injac1);

            List<Integer> injac2 = graph.getOrDefault(numbers[1], new ArrayList<>());
            injac2.add(numbers[0]);
            graph.put(numbers[1], injac2);
        }

        dfs(1);

        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_2606_2().solve();
    }
}
