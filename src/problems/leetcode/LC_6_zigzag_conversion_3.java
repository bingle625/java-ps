package problems.leetcode;

import java.util.Arrays;

public class LC_6_zigzag_conversion_3 {
	public void solve() {
		System.out.println("Solving LC_6_zigzag_conversion_3");
		System.out.println(convert("PAYPALISHIRING", 3));
		System.out.println(convert("PAYPALISHIRING", 4));
		System.out.println(convert("A", 1));
	}

	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;

        StringBuilder[] stringBuilders = new StringBuilder[numRows];
		// Arrays.fill(stringBuilders, new StringBuilder()); // 모두 같은 객체로 채워짐
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        int dir = 1;
        int currentRow = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilders[currentRow].append(c);

            if (currentRow == numRows - 1) {
                dir = -1;
            } else if (currentRow == 0) {
                dir = 1;
            }

            currentRow += dir;
        }

        StringBuilder resultStringBuilder = new StringBuilder();

		for (StringBuilder stringBuilder : stringBuilders) {
			String string = stringBuilder.toString();

			resultStringBuilder.append(string);
		}

        return resultStringBuilder.toString();
	}

	public static void main(String[] args) {
		new LC_6_zigzag_conversion_3().solve();
	}
}
