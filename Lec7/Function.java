package Lec7;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int c= addition1();// calling
		System.out.println(c);
		System.out.println("bye");

	}

	public static int addition1() {
		int a = 90;
		int b = 10;
		int c = a + b;
        // System.out.println(c);
		return c;

	}

	public static void addition() {
		int a = 90;
		int b = 10;
		int c = a + b;
		System.out.println(c);

		if (c == 19) {
			return;
		}

		System.out.println("bye add");

		System.out.println("hello add");

	}

}
