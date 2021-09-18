package Lec16;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		// length
		System.out.println(str.length());
		
//		// Substring 
//		System.out.println(str.substring(1, 1));
//		
//		System.out.println(str.substring(1, 3));
//		System.out.println(str.substring(0));// 1 se end tk
//		System.out.println(str.substring(0));
		
		// ranges  0 to n
		System.out.println(str.substring(0,4));
		
//		// char Access
//		// 0 to n-1
//		System.out.println(str.charAt(4));
//		char [] cha =str.toCharArray();// String to char Array 
//		
//		// index 
//		System.out.println(str.indexOf('l'));
//	
//		for (int i = 0; i < str.length();i++) {
//			if(str.charAt(i)=='L') {
//				System.out.println(i);
//				break;
//			}
//			
//		}
//		
//		System.out.println(str.indexOf("ep"));
//		System.out.println(str.lastIndexOf("l"));
		
		// 
		System.out.println(str.startsWith("e"));
		System.out.println(str.endsWith("lo"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
