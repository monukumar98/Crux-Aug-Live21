package Lec19;

public class Kartik_Bhaiya_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbaaabbaaabaaa";
		int k = 2;
		int flipb=kartikbhaiyaandString(str, k, 'b');
		int flipa=kartikbhaiyaandString(str, k, 'a');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int kartikbhaiyaandString(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			// window me add hoga
			if (str.charAt(ei) == ch) {
				flip++;
			}

			// Window Shrink honga ya nhi

			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;

			}

			// ans upadte
			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		return ans;

	}

}
