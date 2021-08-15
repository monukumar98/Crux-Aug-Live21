package Lec4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = 1;// Number of Stars
		int nsp = n - 1;// Number of space
		int row = 1;
		while (row <= n) {

			// Self work
			// Space
			int csp = 1;// Count of space
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;

			}

			// Star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// next row
			row++;
			System.out.println();
			nsp--;
			nst++;

		}

	}

}
