package Lec27;

public class Tower_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toh(3, "T1", "T2", "T3");

	}

	public static void Toh(int n, String t1, String t2, String t3) {
		if (n == 0) {
			return;
		}

		Toh(n - 1, t1, t3, t2);
		System.out.println(n + "th  disc move from " + t1 + " to " + t2);
		Toh(n - 1, t3, t2, t1);

	}

}
