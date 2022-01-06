package Lec58;

public class Checkithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;

		System.out.println(is1(n, 2));
	}

	public static boolean is1(int n, int i) {
		int mask = (1 << i);

		if ((mask & n) != 0) {
			return true;
		}
		return false;

	}

}
