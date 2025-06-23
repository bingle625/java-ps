package problems;

import java.util.HashSet;
import java.util.Set;

public class leet_code_3_longest_substring {
    public void solve() {
        System.out.println(this.lengthOfLongestSubstring("wigtvsruapegkjfpxheeneviubicjexfofymxqizfohqymhxuobjuytqzctkg"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int longest = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // 중복된 문자가 있는 경우 left 포인터 이동
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // 새로운 문자를 해시셋에 추가
            set.add(s.charAt(right));
            // 현재 윈도우의 길이를 갱신
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
