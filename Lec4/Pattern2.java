package Lec4;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;// Number Of stars 
		while (row <= n) {

			// Self Work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// Next Row
			row++;
			System.out.println();
			nst++;

		}

	}

}
