package Lec24;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SubSeq("abc", "");
//		System.out.println();
//		System.out.println(SubSeqCount("abc", ""));
//		int c = SubSeqPtint_and_count("abc", "");
//		System.out.println();
//		System.out.println(c);
		SubSeq_Static_count("abc", "");
		System.out.println();
		System.out.println(count);

	}

	public static void SubSeq(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		SubSeq(ques.substring(1), ans);// no
		SubSeq(ques.substring(1), ans + ch);// yes

	}

	public static int SubSeqCount(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			// System.out.print(ans+" ");
			return 1;
		}

		char ch = ques.charAt(0);
		int ex = SubSeqCount(ques.substring(1), ans);// no
		int inc = SubSeqCount(ques.substring(1), ans + ch);// yes
		return ex + inc;

	}

	public static int SubSeqPtint_and_count(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char ch = ques.charAt(0);
		int ex = SubSeqPtint_and_count(ques.substring(1), ans);// no
		int inc = SubSeqPtint_and_count(ques.substring(1), ans + ch);// yes
		return inc + ex;

	}

	// static
	static int count = 0;

	public static void SubSeq_Static_count(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			 System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = ques.charAt(0);
		SubSeq_Static_count(ques.substring(1), ans);// no
		SubSeq_Static_count(ques.substring(1), ans + ch);// yes

	}

}
