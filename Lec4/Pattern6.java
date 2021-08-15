package Lec4;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = 0;
		int nst = n;
		int row = 1;
		while (row <= n) {
			// Self Work
			// Space
			int csp = 1;
			while (csp <= nsp) {//
				System.out.print("  ");
				csp++;

			}

			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// Next Row
			row++;
			nsp+=2;
			nst--;
			System.out.println();

		}


	}

}
