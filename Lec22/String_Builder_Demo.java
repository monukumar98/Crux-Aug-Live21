package Lec22;

import java.util.Scanner;

public class String_Builder_Demo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "dkjghjjda";
		StringBuilder sb = new StringBuilder();
//		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//sb.append('a');
		//System.out.println(sb);
		//sb.append("hey");
	//	System.out.println(sb);
//		// sb.delete(0, 2);
//		sb.reverse();
//		System.out.println(sb);
//		System.out.println(sb.substring(1, 3));
//		s = sb.toString();
//		System.out.println(sb);
//		StringBuilder s1 = new StringBuilder();
//		s1.append("12345");
//
//		System.out.println(Integer.parseInt(s1.toString()) + 2);
		sb.append("String Builder");
		sb.append("String Builder");
		sb.append("String Builder");
		sb.append("String Builder");
		sb.append("String Builder");
		sb.append("String Builder");
		sb.append("String Builder");
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
