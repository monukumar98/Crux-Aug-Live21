package Lec16;

public class PlayingWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbaeicdejsdfgsdhaeispoaeiioo";
		System.out.println(GoodSubString(str));

	}

	public static int GoodSubString(String str) {
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < str.length();) {

			if (isvowels(str.charAt(i))) {
				int count = 0;
				while (i < str.length() && isvowels(str.charAt(i))) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);

			}

			i++;

		}
		return ans;

	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
