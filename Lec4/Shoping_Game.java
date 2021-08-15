package Lec4;

import java.util.Scanner;

public class Shoping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0) {
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a=0;
		int h=0;
		int i=1;
		while(a<=m && h<=n) {
			a+=i;
			if(a>m) {
				System.out.println("Harshit");
				break;
			}
			i++;
			h+=i;
			if(h>n) {
				System.out.println("Aayush");
				break;
			}
			i++;
		}
		t--;
		}

	}

}
