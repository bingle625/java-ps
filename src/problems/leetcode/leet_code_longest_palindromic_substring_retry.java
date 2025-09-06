package problems.leetcode;

public class leet_code_longest_palindromic_substring_retry {
	public void solve() {
		String s = "aaaaaaa";
		System.out.println(longestPalindrome(s));

	}

	public String longestPalindrome(String s) {
		String longest = "";
		int left;
		int right;
		for (int i = 0; i < s.length(); i++) {
			// 짝수인 경우
			left = i;
			right = i + 1;
			longest = getLongestPal(s, longest, left, right);

			// 홀수인 경우
			left = i;
			right = i;
			longest = getLongestPal(s, longest, left, right);
		}

		return longest;
	}


	private String getLongestPal(String s, String longest, int left, int right) {
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				if (longest.length() < right - left + 1) {
					longest = s.substring(left, right + 1);
				}
				left--;
				right++;
			} else {
				break;
			}
		}
		return longest;
	}

}
