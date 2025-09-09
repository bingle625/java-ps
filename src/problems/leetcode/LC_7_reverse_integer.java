package problems.leetcode;

import java.util.Scanner;

public class LC_7_reverse_integer {
	public void solve() {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();

		if (s == 0) {
			System.out.println(0);
            return;
		}

		boolean isPositive = s > 0;
		String sText = s + "";

		if (!isPositive) {
			sText = sText.substring(1);
		}

		if (isOutBound(sText, isPositive)) {
			System.out.println(0);
            return;
		}

		int result = reverseNumber(sText);
		if (!isPositive) {
			result = result * -1;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new LC_7_reverse_integer().solve();
	}

	public static boolean isOutBound(String number, boolean isPositive) {
		String target = number;

		int targetLength = target.length();
		if (targetLength > 10) {
            String text = target.substring(10);
			for (int i = 0; i < text.length(); i++) {
				if (target.charAt(i) != '0') {
					return true;
				}
			}

            // -2147483412
            // -2147483412
			isOutBound(target.substring(0, 10), isPositive);

			return true;
		}

		if (targetLength == 10) {
			int numericValue = Character.getNumericValue(target.charAt(9));
			if (numericValue > 2) {
				return true;
			} else if (numericValue == 2) {
				int maxValue = Integer.MAX_VALUE;
				int maxNameoji = maxValue % 2000000000;
                String substring = target.substring(0, 9);
                int reverseNumber = reverseNumber(substring);
                if (isPositive && reverseNumber > maxNameoji) {
					return true;
				} else
					return !isPositive && reverseNumber > maxNameoji + 1;
			}
		}

		return false;
	}

	private static int reverseNumber(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			builder.append(s.charAt(s.length() - 1 - i));
		}
		return Integer.parseInt(builder.toString());
	}
}
