package Lec6;

public class Decto_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 300;
		int sum = 0;
		int mul = 1;
		while (n != 0) {
			int rem = n % 2;// 2 dis base
			sum = sum + rem * mul;
			n /= 2;//dis
			mul *= 10;//src

		}
		System.out.println(sum);

	}

}
