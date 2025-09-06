package problems.leetcode;

public class leet_code_6_zigzag_conversion {
	public void solve() {
		System.out.println("Solving zigzag_conversion");
        System.out.println(convert("abc", 2));
        System.out.println(convert("abc", 3));
        System.out.println(convert("testisnowon", 1));
        System.out.println(convert("testisnowon", 4));
		// 문제 해결 코드 작성
	}

	public String convert(String s, int numRows) {
		// 간격 결정 (2n-2), 0 부터 시작
		// left 는 -2i, right 는 +2i
		// 간격이 0이면 수집x
		// numRows 개에 대해 탐색

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			int left = 2 * numRows - 2;
			int right = 0;
			while (left >= 0 && right >= 0) {
				result.append(findString(s, i, left, right));
				left -= 2;
				right += 2;
			}
		}

        return result.toString();
	}

	private String findString(String s, int i, int left, int right) {
		StringBuilder result = new StringBuilder();
		int current = i;
		boolean isLeft = true;

		while (current < s.length()) {
			result.append(s.charAt(current));

			if (isLeft) {
				current += left;
			}else if(!isLeft){
				current += right;
			}

			if (left == 0) {
				isLeft = false;
			}
		}

		return result.toString();
	}
}
