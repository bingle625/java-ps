package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_11723 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 예시: 한 줄 입력
        // String line = br.readLine();

        int n = Integer.parseInt(br.readLine());

        int[] numMap = new int[21];

        Arrays.fill(numMap, 0);

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<n; i++){
            String[] sArr = br.readLine().split(" ");
            doCalc(sArr, numMap, bw);
        }

        System.out.println(sb);
    }

    public static void doCalc(String[] sArr, int[] numMap,BufferedWriter bw) throws Exception{
        String command = sArr[0];
        switch(command){
            case "add":
                numMap[Integer.parseInt(sArr[1])] = 1;
                break;
            case "remove":
                numMap[Integer.parseInt(sArr[1])] = 0;
                break;
            case "check":
                // sb.append(numMap[Integer.parseInt(sArr[1])] + "\n");
                bw.write(numMap[Integer.parseInt(sArr[1])] + "\n");
                break;
            case "toggle":
                int key =Integer.parseInt(sArr[1]);
                int result = numMap[key];
                numMap[key] = (result +1) % 2;
                break;
            case "all":
                Arrays.fill(numMap, 1);
                break;
            case "empty":
                Arrays.fill(numMap, 0);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        new BOJ_11723().solve();
    }
}
