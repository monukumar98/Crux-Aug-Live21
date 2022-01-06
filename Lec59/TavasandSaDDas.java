package Lec59;

public class TavasandSaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "7474";
		System.out.println(Tavas_and_SaDDas(str));

	}

	public static int Tavas_and_SaDDas(String str) {
		int n = str.length();
		int count = (1 << n) - 2;// 2^4 -2
		int pos = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				count = count + (1 << pos);
			}
			pos++;
		}
		return count + 1;

	}

}
