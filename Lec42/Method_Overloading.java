package Lec42;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(7.0f, 9));
		System.out.println(add(2, 8));
		System.out.println(add(4.9f, 80l));
		System.out.println(add(2, 3, 4, 5, 5, 6, 7, 7, 7, 8, 8, 9));

	}

	public static int add(int a, int b) {
		System.out.println("2 args");
		return a + b;

	}

	public static int add(float a, int b) {
		return (int) (a + b);

	}

	public static int add(float a, long b) {
		return (int) (a + b);

	}

	public static int add(int... arg) {
		int ans = 0;

		for (int i = 0; i < arg.length; i++) {
			ans += arg[i];

		}
		return ans;

	}
	
	public static int add(float a, int... arg) {
		int ans = 0;

		for (int i = 0; i < arg.length; i++) {
			ans += arg[i];

		}
		return ans;

	}
	
	
	

}
