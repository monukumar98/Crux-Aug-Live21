package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		// ++
		// a++;//post Inc

//		System.out.println(a++);5
//		System.out.println(a);6
		int b = a++;// a=a+1;
		System.out.println(b);
		System.out.println(a);

		// ++a;//pre Inc
		int a1 = 6;
//		System.out.println(++a1);//7
//		System.out.println(a1);//7

		int c = ++a1;// a1=a1+1;

		System.out.println(c);
		System.out.println(a1);
		
		
		// Dec
		
		int x=5;
		int y =x--;//x=x-1;
		System.out.println(y);//5
		System.out.println(x);//4
		
		int x1=6;
		int y1=--x1;//x1=x1-1;
		System.out.println(y1);
		System.out.println(x1);
	
		int w=9;
		w++;// w=w+1;
		System.out.println(w);
		

	}

}
