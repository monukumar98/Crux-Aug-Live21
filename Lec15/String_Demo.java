package Lec15;


public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2 = new String("hello");
		System.out.println(str==str1);
//		System.out.println(str);
//		System.out.println(str1);
//		System.out.println(str2);
		
		//str1=str1+"bye";
		str1=str1.concat("bye");
		//str1="hello";
		System.out.println(str1);
		
		System.out.println(str==str1);// address compare 
		System.out.println(str1==str2);
		
		System.out.println(str.equals(str2));//Content Compare
	
		
		
		
		
		
		
		
		
		

		
		
		
		

	}

}
