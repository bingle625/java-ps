package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class leet_code_4_median_of_two_sorted_arrays {

  public void solve() {
    System.out.println(this.findMedianSortedArrays(new int[]{1}, new int[]{1,1}));
    // 문제 해결 코드 작성
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      final int[] merged = Arrays.copyOf(nums1, nums1.length + nums2.length);
      System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
      Arrays.sort(merged);

      final int length = merged.length;

      if (length % 2 == 0) {
          final int middleRight = length / 2;
          final int middleLeft = middleRight - 1;

          return (double) (merged[middleRight] + merged[middleLeft]) / 2;
      }else{
          final int middle = length / 2;

          return merged[middle];
      }
  }
}
