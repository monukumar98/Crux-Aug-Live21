package Lec8;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumofdigit=sum_ofdigit(n);
		int i=2;
		int sum=0;
		while(i<=n) {
			if(n%i==0) {
				sum+=sum_ofdigit(i);
				n/=i;
			}
			else {
				i++;
			}
			
		}
		if(sumofdigit==sum) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		

	}

	public static int sum_ofdigit(int n) {

		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;

		}
		return sum;

	}

}
