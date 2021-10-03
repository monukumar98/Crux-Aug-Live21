package Lec23;

public class PrintD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pd(5);

	}

	public static void pd(int n) {
          if(n==0) {
        	  return ;
          }
		System.out.println(n);
		pd(n - 1);

	}

}
