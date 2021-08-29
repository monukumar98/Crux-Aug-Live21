package Lec3;

import java.util.*;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// Input lene ke liye hai
		int n = sc.nextInt();// Integer ka Input
		// n=sc.nextInt();
		int flag = 0;
		int i = 2;
		while (i < n) {// i<=n-1
			if (n % i == 0) {
				System.out.println("not Prime");
			   flag = 1;
				break;// loop se bahar
			}

			i++;
		}
		if (flag == 0) {
			System.out.println("Prime");
		}
	}

}
