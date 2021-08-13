package Lec3;

public class Inverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int place = 1;
		int ans = 0;
		while (n > 0) {

			int rem = n % 10;
			ans = ans + (int) (place * Math.pow(10, rem - 1));
			n = n / 10;
			place++;// place=place+1;

		}
		System.out.println(ans);

	}

}
