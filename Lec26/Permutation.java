package Lec26;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllPermutation("abc", "");

	}

	public static void PrintAllPermutation(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			String part1=ques.substring(0,i);
			String part2=ques.substring(i+1);
			char ch = ques.charAt(i);
			PrintAllPermutation(part1+part2, ans+ch);
			

		}

	}

}
