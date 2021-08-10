package Lec2;

public class Grade_Crade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 67;
		if (marks >= 85) {
			System.out.println("Garde A");
		} 
		else if (marks < 85 && marks >= 75) {
			System.out.println("Garde B");
		} 
		else if (marks < 75 && marks >= 65) {
			System.out.println("Garde c");
		}

		else if (marks < 65 && marks >= 55) {
			System.out.println("Garde D");
		} 
		else if (marks < 55 && marks >= 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
