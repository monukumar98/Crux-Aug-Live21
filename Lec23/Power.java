package Lec23;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 7));

	}

	public static int power(int a, int b) {
		// base Case
		if (b == 0) {
			return 1;
		}

		int ans = power(a, b - 1);
		return a * ans;

	}

}
