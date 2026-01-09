package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2606 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 예시: 한 줄 입력
        // String line = br.readLine();

        // connectedMap 만들고
        // frontie Queue에서 뽑아내면서 bfs 돌리기
        // 돌릴때 visitedSet 관리하면서 visitedSet에 있다면
        // 뽑아낸 애를 visited에 넣는다 -> 그애에 대한 connected를 queue에 넣는다. -> queue에서 뽑아낸다.

        Map<String, List<String>> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());

        for(int i =0; i<v; i++){
            String[] inputs = br.readLine().split(" ");
            List<String> targets = map.getOrDefault(inputs[0], new ArrayList<String>());
            targets.add(inputs[1]);
            map.put(inputs[0], targets);

            List<String> targets2 = map.getOrDefault(inputs[1], new ArrayList<String>());
            targets2.add(inputs[0]);
            map.put(inputs[1], targets2);
        }

        Deque<String> frontier = new ArrayDeque<String>();
        Set<String> visited = new HashSet<>();

        frontier.addFirst("1");

        while(!frontier.isEmpty()){
            String target = frontier.pollLast();
            if(visited.contains(target)){
                continue;
            }
            visited.add(target);
            List<String> nexts = map.getOrDefault(target, List.of());
            for(String next: nexts){
                if(visited.contains(next)) continue;
                frontier.addFirst(next);
            }
        }

        System.out.println(visited.size() - 1);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_2606().solve();
    }
}
