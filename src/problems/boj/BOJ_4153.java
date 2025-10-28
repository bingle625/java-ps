package problems.boj;

import java.io.*;
import java.util.Arrays;

public class BOJ_4153 {
    /**
 * // reader.readLine()
 * // writer.append("").append("\n")
 *
 * // String -> int/long
 * // int n = Integer.parseInt(reader.readLine());
 * // long n = Long.parseLong(reader.readLine());
 *
 * // String -> int[]/long[]
 * // int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
 * // long[] arr = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
 * // double[] arr = Arrays.stream(reader.readLine().split(" ")).mapToDo…
 */
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if(numbers[0] == 0){
                break;
            }

            int maxNum = -1;
            for (int i = 0; i < numbers.length; i++) {
                maxNum = Integer.max(maxNum, numbers[i]);
            }

            int aSquredPlusBsqured = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] != maxNum){
                    aSquredPlusBsqured += numbers[i] * numbers[i];
                }
            }

            if(maxNum* maxNum == aSquredPlusBsqured){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }

    }

    public static void main(String[] args) throws IOException {
        new BOJ_4153().solve();
    }
}
