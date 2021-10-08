package Lec26;

public class Key_Paid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypiad("12", "");

	}

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void keypiad(String ques, String ans) {// 123,""
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);// 1
		String keyString = key[ch - 48];// 49-48

		for (int i = 0; i < keyString.length(); i++) {
			keypiad(ques.substring(1), ans + keyString.charAt(i));//23,a

		}

	}

}
