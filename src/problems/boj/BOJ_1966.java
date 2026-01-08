package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1966 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-- > 0){
            String[] s1 = reader.readLine().split(" ");
            Integer[] s2 = Arrays.stream(reader.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

            System.out.println(getOrder(s2, Integer.valueOf(s1[1])));
        }
    }

    public static int getOrder(Integer[] inputs, Integer target){
        // 구현을 직접 해보자.
        // 1. inputs 순회하면서 우선순위별 개수를 array에 넣는다. 또한, element -> priority array도 만든다.
        // 2. 이제 deque에 대해서 inputs를 다 집어넣고 cnt=0 인상태로 시작한다.
        // 3. cnt를 더해주고, 특정 input의 priority 를 get 해서, 우선순위 array 상에서 해당 우선순위보다 큰 key의 value가 0보다 크면, 해당 input을 poll해서, offefLast한다. 해당 우선순위가 가장 높다면, 뽑는다. 이때, target 과 비교한다.

        Integer[] priArr = new Integer[10];
        Arrays.fill(priArr, 0);
        Integer[] queueArr = new Integer[inputs.length];
        for(int i=0; i<inputs.length; i++){
            priArr[inputs[i]]++;
            queueArr[i] = i;
        }

        Deque<Integer> queue = new ArrayDeque<Integer>(Arrays.asList(queueArr));

        int cnt = 0;
        while(!queue.isEmpty()){

            var number = queue.pollFirst();
            var prior = inputs[number];
            if(isThereBiggerPrior(prior, priArr)){
               queue.offerLast(number); 
            } else {
                cnt++;
                priArr[prior]--;
                if(target.equals(number)) return cnt;
            }
        }

        return 1;
    }
    public static boolean isThereBiggerPrior(Integer priority, Integer[] priorArr){

        for(int i=9; i>priority; i--){
            if(priorArr[i] > 0){
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        new BOJ_1966().solve();
    }
}
