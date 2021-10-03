package Lec23;

public class PrintI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PI(5);

	}

	private static void PI(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return ;
		}
		
		PI(n-1);
		System.out.println(n);
		
	}
	

}
