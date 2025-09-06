package problems.leetcode;

public class LC_6_zigzag_conversion_2 {
	public void solve() {

		System.out.println(convert("A", 1));
		System.out.println(convert("AAaAAAA", 1));
		System.out.println(convert("PAYPALISHIRING", 3));
		System.out.println(convert("PAYPALISHIRING", 4));
	}

	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		StringBuilder[] builders = new StringBuilder[numRows];

		// 방향은 두가지 아래 or 대각선 오른쪽 위
		// 즉, dir은 +1, -1, 사실 대각선위라는건 builder 관점에서는 필요가 없는 고려 왜냐면, x축으로는 그냥 늘어나니까,,?
		int dir = 1;
		int pos = 0;
		for (int i = 0; i < s.length(); i++) {
			if (builders[pos] == null)
				builders[pos] = new StringBuilder();
			builders[pos].append(s.charAt(i));
			pos += dir;
			if (pos == numRows - 1) {
				dir = -1;
			} else if (pos == 0) {
				dir = 1;
			}
		}

		StringBuilder newBuilder = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			if(builders[i] != null) newBuilder.append(builders[i].toString());
		}

		return newBuilder.toString();
	}

	public static void main(String[] args) {
		new LC_6_zigzag_conversion_2().solve();
	}
}
