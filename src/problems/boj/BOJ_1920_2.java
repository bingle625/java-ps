package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1920_2 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] mArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            sb.append(doBinarySearch(nArr, mArr[i]) + "\n");
        }

        System.out.println(sb);
    }

    public static int doBinarySearch(int[] array, int target){
        int low =0;
        int high = array.length-1;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(array[mid] == target) return 1;

            if(array[mid] > target) high = mid-1;
            else low = mid+1;
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1920_2().solve();
    }
}
