package problems;

import java.util.ArrayDeque;

public class leet_code_5_longest_palindromic_substring {
	public void solve() {
        System.out.println(isPalindromic("bcb"));
        System.out.println(longestPalindrome("aebcb"));
        System.out.println(longestPalindrome("abcbbcbba"));
		System.out.println(longestPalindrome("abcbbcbba").equals("bcbbcb"));
		System.out.println(longestPalindrome("a").equals("a"));
		System.out.println(longestPalindrome("abcdefg").equals("a"));
		System.out.println(longestPalindrome("babad").equals("bab"));
		System.out.println(longestPalindrome("cbbd").equals("bb"));
		System.out.println(longestPalindrome("eabcb").equals("bcb"));
	}

	public String longestPalindrome(String s) {
		// 탐색
		int initPos = 0;
        // endPos는 length 가 끝점
		int endPos = initPos + 1;
        int endCur = initPos + 1;

		int length = s.length();
        String longestPalindrome = s.substring(0,1);

        while (endPos <= length) {
            while (endCur <= length) {
                String substring = s.substring(initPos, endCur);
                if (isPalindromic(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
                endCur += 1;
            }
            initPos += 1;
            endPos = initPos + 1;
            endCur = endPos;
        }
		return longestPalindrome;
	}

    private boolean isPalindromic(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
