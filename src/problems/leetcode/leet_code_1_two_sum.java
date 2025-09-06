package problems.leetcode;

import java.util.Arrays;

public class leet_code_1_two_sum {
    public void solve() {
        int[] result = this.twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }
        }
        return new int[]{1};
    }
}
