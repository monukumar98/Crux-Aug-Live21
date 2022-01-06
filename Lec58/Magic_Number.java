package Lec58;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthnuber(7));
	}

	public static int nthnuber(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			n >>= 1;// n=n>>1
			mul *= 5;
		}
		return ans;
	}

}
