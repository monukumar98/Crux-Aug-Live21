package Lec26;

public class Tricky_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllPermutation("abac", "");

	}

	public static void PrintAllPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean isp = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ch == ques.charAt(j)) {
					isp = true;
					break;
				}
			}
			if (isp==false) {
				String part1 = ques.substring(0, i);
				String part2 = ques.substring(i + 1);

				PrintAllPermutation(part1 + part2, ans + ch);
			}

		}

	}

}
