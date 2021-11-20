package Lec41;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P obj = new P();
//		C obj1 = new C();

		// Case 1
//		P obj = new P();
//
//		System.out.println(obj.d);//1
//		System.out.println(obj.d1);//10
//		obj.fun();
//		obj.fun1();

		// Case 2
//		long i = 90;
//		int ii = (int) i;
//
//		P obj1 = new C();
//		System.out.println(obj1.d);// 1
//		System.out.println(obj1.d1);// 10
//		System.out.println(((C) obj1).d2);// 20
//		System.out.println(((C) obj1).d);// 2
//
//		obj1.fun1();
//		obj1.fun();
//		((C) obj1).fun2();
//	

		// Case 3

//		C obj2 = new P();
//		System.out.println(obj2.d);
//		System.out.println(obj2.d2);
//		System.out.println(obj2.d1);

// Case 4

		C obj3 = new C();
		System.out.println(obj3.d);//2
		System.out.println(obj3.d1);//10
		System.out.println(obj3.d2);//20
		System.out.println(((P)obj3).d);//1
		
		
		
		obj3.fun();
		obj3.fun1();
		obj3.fun2();
		
		
		
		
		
		
		
		
		

	}

}
