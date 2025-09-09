package problems.leetcode;

public class LC_Longest_Palindromic_Substring_3 {
	public void solve() {
        System.out.println(longestPalindrome("aacabdkacaa"));
        System.out.println(longestPalindrome("aaaaaaaa"));
        System.out.println(longestPalindrome("a"));
	}

    public String longestPalindrome(String s) {
        // s 최대 입력 길이 1000 n^2 정도까지 가능
        // 시도할 풀이 => palindrome 안에 palindrome 을 찾아서 키워가는 식으로 찾을 거임
        String longestPal = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            // 가장긴 pal이 짝수 일때에는 i가 왼쪽, i+1이 오른쪽으로 해서 palindrome 확인
            // 가장긴 pal이 홀수 일때에는 i-1이 왼쪽, i+1이 오른쪽으로해서 같은지 확인, 이때에는 첫 palindrome이 s.substring(i,i+1) 이라고 가정하고 시작해야함

            int left = i;
            int right = i + 1;
            longestPal = getLongestPal(s, longestPal, left, right);

            left = i - 1;
            right = i + 1;
            longestPal = getLongestPal(s, longestPal, left, right);
        }

        return longestPal;
    }

    private String getLongestPal(String s, String longestPal, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longestPal.length()) {
                    longestPal = s.substring(left, right + 1);
                }

                left--;
                right++;
            }else{
                break;
            }


        }
        return longestPal;
    }

	public static void main(String[] args) {
		new LC_Longest_Palindromic_Substring_3().solve();
	}
}
