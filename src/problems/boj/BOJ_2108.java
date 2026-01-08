package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2108 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 예시: 한 줄 입력
        // String line = br.readLine();

        int n = Integer.parseInt(br.readLine());
        int[] inputArr = new int[n];
        int[] numberMap = new int[8001];
        Arrays.fill(numberMap, 0);
        
        int sum =0;
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            inputArr[i] = a;
            numberMap[a+4000] += 1;
            sum += a;
        }

        Arrays.sort(inputArr);

        int maxCount =0;
        List<Integer> keys = new ArrayList<>();
        for(int i=-4000; i<4001; i++){
            if(maxCount < numberMap[i+4000]){
                maxCount = numberMap[i+4000];
                keys = new ArrayList<>();
                keys.add(i);
            }else if(maxCount == numberMap[i+4000]){
                keys.add(i);
            }
        }

        Integer[] keysArr = keys.toArray(new Integer[0]);
        Arrays.sort(keysArr, (a,b) -> a-b);

        Integer result = keysArr.length > 1 ? keysArr[1] : keysArr[0];

        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(sum/ (float)n) + "\n");
        sb.append(inputArr[n/2] + "\n");
        sb.append(result + "\n");
        sb.append(inputArr[n-1] - inputArr[0]);
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_2108().solve();
    }
}
