package Lec31;

public class Tilling_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TillingProblem(4));

	}
	public static int TillingProblem(int n) {// 1*4
		if(n<4) {
			return 1;
			
		}
		
		int h = TillingProblem(n-4);
		int v = TillingProblem(n-1);
		return h+v;
	}
	

}
