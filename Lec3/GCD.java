package Lec3;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divident = sc.nextInt();
		int divisor = sc.nextInt();
		while (divident % divisor != 0) {
			int rem = divident % divisor;// 24
			divident = divisor;// 36
			divisor = rem;

		}
		System.out.println(divisor);

	}

}
