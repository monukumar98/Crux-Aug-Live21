package Lec22;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abc2");
		sb.append("absdbjvjsd");
		sb.append("absdbjvjsd");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringDemo1();

	}
	public static void StringDemo() {
		String s="";
		for (int i = 0; i <100000; i++) {
			s+=i;
			
		}
	
		System.out.println(s);
	}
	public static void StringDemo1() {
		StringBuilder sb = new StringBuilder("abc2");
		for (int i = 0; i <100000; i++) {
			sb.append(i);
			
		}
		System.out.println(sb);
		
	}


}
