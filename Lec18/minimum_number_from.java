package Lec18;

import java.util.Scanner;

public class minimum_number_from {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t>0) {
		String s = sc.next();
		From_given_Sequence(s);
		
		
		t--;
	}

	}

	public static void From_given_Sequence(String str) {
		// TODO Auto-generated method stub
		int [] ans = new int [str.length()+1];
		int counter =1;
		for (int i = 0; i <=str.length(); i++) {
		
			if(i==str.length() ||str.charAt(i)=='I') {
				ans[i]=counter;
				counter++;
				for(int j=i-1; j>=0 && str.charAt(j)!='I'; j--) {
					ans[j]=counter;
					counter++;
					
				}
				
			}
			
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
		
	}

}
