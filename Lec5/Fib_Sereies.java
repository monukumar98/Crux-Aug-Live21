package Lec5;

public class Fib_Sereies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int f1 = 0;
		int f2 = 1;
		int i = 0;
		int sum = 0;
		while (i <= n) {
			System.out.print(f1 + " ");
			// next fib

			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			i++;

		}

	}

}
