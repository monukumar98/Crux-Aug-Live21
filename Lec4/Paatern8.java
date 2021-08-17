package Lec4;

import java.util.Scanner;

public class Paatern8 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int nst = n;
	int nsp = 0;

	while (row <= n) {
		int csp = 1;
		while (csp <= nsp) {
			System.out.print("  ");
			csp++;
		}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;

			}
			row++;
			System.out.println();
			nst--;
			nsp += 2;

		}

	}


}
