package Lec27;

public class LexiCo_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexco_Counting(0, 100);

	}

	public static void lexco_Counting(int curr, int end) {
         if(curr>end) {
        	 return ;
         }
		System.out.println(curr);

		int i = 0;
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			lexco_Counting(curr * 10 + i, end);
		}

	}

}
