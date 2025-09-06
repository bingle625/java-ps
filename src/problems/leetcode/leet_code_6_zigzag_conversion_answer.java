package problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_code_6_zigzag_conversion_answer {
	public void solve() {
		System.out.println("Solving zigzag_conversion");
        System.out.println(convert("abc", 2));
        System.out.println(convert("abc", 3));
        System.out.println(convert("testisnowon", 1));
        System.out.println(convert("testisnowon", 4));
		// 문제 해결 코드 작성
	}

	public String convert(String s, int numRows) {
		// "abcdefghi", numrows=4 이면, 1,2,3,4,3,2,1,2,3 순서이다.
		// 즉, direction을 수정하면서 직접 왔다갔다 하면 된다는 말이다.

		// 가로 쭉이거나 세로 쭉인 경우
		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}

		// 인덱스(포인터) 와 방향 정의
		int idx = 0, d = 1;
		List<Character>[] rows = new ArrayList[numRows];
		for (int i = 0; i < numRows; i++) {
			// row 개수만큼 정의
			rows[i] = new ArrayList<>();
		}

		// 문자열 순차조회
		for (char c : s.toCharArray()) {
			// 2차원 array에 c 적재, 같은 row = 같은 index
			rows[idx].add(c);
			if (idx == 0) {
				d = 1;
			} else if (idx == numRows - 1) {
				d = -1;
			}
			idx += d;
		}

		StringBuilder result = new StringBuilder();
		// rows 하나씩 조회
		for (List<Character> row : rows) {
			// row 하나씩 조회
			for (char c : row) {
				result.append(c);
			}
		}

		return result.toString();
	}
}
