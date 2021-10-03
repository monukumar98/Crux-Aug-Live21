package Lec23;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	public static int fact(int n) {
		//base case
		if(n==1 || n==0) {
			return 1;
		}
		
		//Smaller Problem
		int f = fact(n-1);
		
		// self work
		
		return n*f;

	}

}
