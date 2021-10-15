package Lec27;

public class Tower_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toh(3, "T1", "T2", "T3");

	}

	public static void Toh(int n, String src, String dis, String help) {
		if (n == 0) {
			return;
		}

		Toh(n - 1, src, help, dis);
		System.out.println(n + "th  disc move from " + src + " to " + dis);
		Toh(n - 1, help, dis, src);

	}

}
