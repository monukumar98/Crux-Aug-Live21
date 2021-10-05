package Lec24;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubSeq("abc", "");

	}

	public static void SubSeq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);
		SubSeq(ques.substring(1), ans + ch);// yes
		SubSeq(ques.substring(1), ans);// no

	}

}
