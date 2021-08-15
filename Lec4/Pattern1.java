package Lec4;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;// Number of Stars
		while (row <= n) {
			// Self Work
			int cst = 1;// Count of stars
			while (cst <= nst) {
				System.out.print("* ");
				cst++;

			}

			// Next Row Pre
			row++;
			System.out.println();

		}

	}

}
