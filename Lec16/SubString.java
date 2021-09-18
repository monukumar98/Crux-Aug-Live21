package Lec16;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Substring(str);

	}

	public static void Substring(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				String s = str.substring(i, j);
				if (is_Pali(s)) {
					System.out.println(s);
				}

			}

		}

	}

	public static boolean is_Pali(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
