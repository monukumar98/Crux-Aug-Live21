package Lec24;

public class Fact_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5,1));

	}
	// tail
	public static int fact(int n, int ans) {
		//base case
		if(n==1 || n==0) {
			return ans;
		}
		
	
		// self work
		
		return fact(n-1,n*ans);

	}

}
