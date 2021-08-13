package Lec3;

public class Sumof_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2345;
		int sum = 0;

		while (n > 0) {

			int rem = n % 10;
			sum += rem;

			n = n / 10;

		}
		System.out.println(sum);

	}

}
