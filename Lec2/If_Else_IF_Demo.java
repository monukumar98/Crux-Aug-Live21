package Lec2;

public class If_Else_IF_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		if (age < 18) {
			System.out.println("below 18");
		} else if (age >= 18 && age < 45) {
			System.out.println("adult");
		} else {
			System.out.println("Old");
		}

	}

}
