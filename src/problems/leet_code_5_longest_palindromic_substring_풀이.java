package problems;

public class leet_code_5_longest_palindromic_substring_풀이 {
	public void solve() {
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
		if (s.length() <= 1) {
			return s;
		}

		String maxStr = s.substring(0, 1);

		for (int i = 0; i < s.length() - 1; i++) {
			String odd = expandFromCenter(s, i, i);
			String even = expandFromCenter(s, i, i + 1);

			if (odd.length() > maxStr.length()) {
				maxStr = odd;
			}

			if (even.length() > maxStr.length()) {
				maxStr = even;
			}


		}
			return maxStr;
	}

	private String expandFromCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}

		return s.substring(left + 1, right);
	}

}
