package Lec46;

public class Client_Min {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Min_Stack s = new Min_Stack();
		s.push(5);
		s.push(7);
		s.push(2);
		s.push(9);
		s.push(4);
		s.push(3);
		s.push(8);
		s.push(1);
		s.push(17);
		s.Display();
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.min());
		
		

	}

}
