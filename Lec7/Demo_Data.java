package Lec7;

import java.util.Scanner;

public class Demo_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1000_000_000;
		System.out.println(n);
		long l = 1000_000_00000000l;
		//long ll = sc.nextLong();
//		System.out.println();
		byte b = 89;

		float f = 6.7f;
		double d = 9.9;
		b=(byte) d;
		System.out.println(b);
		
		//  char 
		
		char ch='a';
		ch++;// ch=(char)(ch+1)
		ch=(char)(ch+1);
		//System.out.println(ch++);//post Increment 
		System.out.println((int)ch);
		System.out.println(ch);
		System.out.println((char)ch+1);//100
		System.out.println(++ch);//per Increment 
//		
//		char ch1='0';
//		int i=0;
//		System.out.println(i);//0
//		System.out.println((int)ch1);//48
//		
//		//ch++;// ch= (char)(char + 1);
//		System.out.println(ch++);//a
//		System.out.println(ch);//b
//		
//		ch =  (char) (1+ ch);
		ch+=1;//ch= (char)(char + 1);
		
		int i=8855;
		ch=' ';
		ch =(char) i;
		System.out.println(ch);
		
		ch=sc.next().charAt(0);
		double dd=sc.nextDouble();
		
		boolean bl=true;//false;// size 1 bit
		bl=sc.nextBoolean();
		System.out.println(ch);
		System.out.println(dd);
		System.out.println(bl);
		
		
		
		
		
		
		
		
		

	}

}
