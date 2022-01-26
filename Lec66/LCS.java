package Lec66;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String t = "ace";
		System.out.println(lcs(s, t, 0, 0));

	}

	public static int lcs(String s, String t, int i, int j) {
		if (i == s.length() || j == t.length()) {
			return 0;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = lcs(s, t, i + 1, j + 1) + 1;
		}

		else {
			int fd = lcs(s, t, i + 1, j);
			int sd = lcs(s, t, i, j + 1);
			ans = Math.max(fd, sd);
		}
		return ans;

	}

	public static int lcsBU(String s, String t) {
		int[][] dp = new int[s.length() + 1][t.length()];
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {

				int ans = 0;
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					ans = dp[i - 1][j - 1]+1;

				} else {
					ans = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
                dp[i][j]=ans;
				
			
			}

		}
		
		return dp[s.length()][t.length()];

	}

	public static int lcs_Back(String s, String t, int i, int j) {
		if (i == s.length() || j == t.length()) {
			return 0;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = lcs(s, t, i - 1, j - 1) + 1;
		}

		else {
			int fd = lcs_Back(s, t, i - 1, j);// (i-1,j)
			int sd = lcs_Back(s, t, i, j - 1);// (j,i-1)
			ans = Math.max(fd, sd);
		}
		return ans;

	}
	
	
	
	
	
	
	
}
