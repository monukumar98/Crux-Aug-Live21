package Lec59;

public class CountSet_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;
		System.out.println(CountSetBit(n));
		System.out.println(FastCountSetBit(n));

	}

	public static int CountSetBit(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;
		}
		return count;
	}

	public static int FastCountSetBit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = (n & (n - 1));
		}
		return count;

	}
}
