package Lec8;

public class Glob_Var_Demo {

	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		int b = 100;

		int c = addition(a, b);
		
		// System.out.println(c);//190
		System.out.println(val);

		System.out.println(val);

	}

	public static int addition(int a, int b) {
		// TODO Auto-generated method stub
		int c = a + b;
//		System.out.println(a);
//		System.out.println(b);
		int val = 10;
		val++;
		System.out.println("add"+ val);

		return c;
	}

}
