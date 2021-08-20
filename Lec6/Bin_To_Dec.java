package Lec6;

public class Bin_To_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=101111;
		int sum = 0;
		int mul = 1;
		while (n != 0) {
			int rem = n % 10;// 10 dis base
			sum = sum + rem * mul;
			n /= 10;//dis
			mul *= 2;//src

		}
		
		System.out.println(sum);


	}

}
