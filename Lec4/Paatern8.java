package Lec4;

public class Paatern8 {
public static void main(String[] args) {
	int n = 5;
	int nsp = 0;
	int nst = n;
	int row = 1;
	while (row <= 2*n-1) {
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
		if(row<n) {
		nsp+=2;
		nst--;
		}
		else {
			nsp-=2;
			nst++;
		}
		System.out.println();
		row++;

	}

}
}
