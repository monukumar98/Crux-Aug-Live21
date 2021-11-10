package Lec38;

import java.util.Arrays;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(is_prime(2));
		boolean []prime= Sieve(100);
		for (int i = 0; i < prime.length; i++) {
			if(prime[i]) {
				System.out.print(i+" ");
			}
		}
		

	}

	public static boolean is_prime(int n) {

		int fact = 2;

		while (fact * fact <= n) {
			if (n % fact == 0) {
				return false;
			}
			fact++;

		}

		return true;

	}

	public static boolean [] Sieve(int n) {

		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i]) {
				for (int mul = 2; mul * i <=n; mul++) {
					prime[i*mul]=false;

				}

			}

		}
		return prime;

	}

}
