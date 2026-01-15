import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> ls = Arrays.stream(nums).boxed()
            .collect(Collectors.toList());
        Set<Integer> set = new HashSet<Integer>(ls);
        int count = set.size();
        int max = nums.length;
        int answer = 0;
        
        if(max/2 < count) answer = max/2;
        else answer = count;
        
        return answer;
    }
}