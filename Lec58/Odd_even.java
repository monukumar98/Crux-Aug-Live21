package Lec58;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;//
		odd_even(a);

	}

	public static void odd_even(int n) {

		if ((n & 1) != 0) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}

	}

}
