package Lec4;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		
		while (row <= n) {
			// Space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("   ");
				csp++;
			}
			int cst = 1;
			int val = 1;
			while (cst <= nst) {
				if (val <= 9) {
					System.out.print(" " + val + " ");
				} else {
					System.out.print(val + " ");
				}
				cst++;
				val++;
			}

			row++;
			nsp--;
			nst += 2;
			System.out.println();
		}


	}

}
