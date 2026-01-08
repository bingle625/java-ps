package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1260 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmvs = br.readLine().split(" ");
        int n = Integer.parseInt(nmvs[0]);
        int m = Integer.parseInt(nmvs[1]);
        String v = nmvs[2];
        
        Map<String, HashSet<String>> map = new HashMap<>();
        for(int i=0; i< m; i++){
            String[] numbers = br.readLine().split(" ");
            
            HashSet<String> targetSet = map.getOrDefault(numbers[0], new HashSet<String>());
            targetSet.add(numbers[1]);
            map.put(numbers[0], targetSet);

            HashSet<String> targetSet2 = map.getOrDefault(numbers[1], new HashSet<String>());
            targetSet2.add(numbers[0]);
            map.put(numbers[1], targetSet2);
        }

        StringBuilder s = dfs(map, v);
        StringBuilder s2 = bfs(map, v);
        System.out.println(s);
        System.out.println(s2);
    }

    public static StringBuilder bfs(Map<String, HashSet<String>> map, String v){
        StringBuilder sb = new StringBuilder();

        Set<Integer> visited = new HashSet<>();
        Deque<String> frontier = new ArrayDeque<String>();
        frontier.addFirst(v);
        
        while(!frontier.isEmpty()){
            String poped = frontier.pollLast();
            if(visited.contains(Integer.valueOf(poped))) continue;
            sb.append(poped + " ");
            visited.add(Integer.valueOf(poped));
            
            HashSet<String> targets = map.getOrDefault(poped, new HashSet<String>());
            String[] sArr = targets.toArray(String[]::new);
            
            Arrays.sort(sArr, (a,b) -> {
                return Integer.valueOf(a) - Integer.valueOf(b);
            });
            
            for(String s : sArr){
                if(!visited.contains(Integer.valueOf(s))) frontier.addFirst(s);
            }
        }
        
        return sb;
    }

    public static StringBuilder dfs(Map<String, HashSet<String>> map, String v){
        StringBuilder sb = new StringBuilder();

        Set<Integer> visited = new HashSet<>();
        Deque<String> frontier = new ArrayDeque<String>();
        frontier.addFirst(v);
        while(!frontier.isEmpty()){
            String poped = frontier.pollFirst();
            if(visited.contains(Integer.valueOf(poped))) continue;
            sb.append(poped + " ");
            visited.add(Integer.valueOf(poped));
            HashSet<String> targets = map.getOrDefault(poped, new HashSet<String>());
            String[] sArr = targets.toArray(String[]::new);
            
            Arrays.sort(sArr, (a,b) -> {
                return Integer.valueOf(b) - Integer.valueOf(a);
            });
            
            for(String s : sArr){
                if(!visited.contains(Integer.valueOf(s))) frontier.addFirst(s);
            }
        }
        
        return sb;
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1260().solve();
    }
}
