package Lec58;

public class Shift_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=87;
		// right shift 
		System.out.println(a>>4);//89/2^4
		System.out.println((-5)>>1);
		
		
		// left shif
		System.out.println(5<<2);
		System.out.println(-9<<2);
		byte b=65;
		byte b1=1;
		long ll=90;
		ll = ll<<1;
		System.out.println(ll);
		b= (byte) (b<<b1);
		System.out.println(b);
		
		

	}

}
