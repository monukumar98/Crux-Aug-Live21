package Lec23;

public class PrintID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PI(5);
		System.out.println(0);
		pd(5);

	}

	private static void PI(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}

		PI(n - 1);
		System.out.println(n);

	}

	public static void pd(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		pd(n - 1);

	}
}
