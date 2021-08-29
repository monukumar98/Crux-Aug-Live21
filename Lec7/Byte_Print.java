package Lec7;

public class Byte_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = (byte) 128;
		for (byte b = 1; b <=128; b++) {// b++=(byte)(b+1); // Infinite loop

			System.out.println(b);

		}
		for (byte b = 1; b <= 127; b++) {// b++=(byte)(b+1); // Infinite loop

			System.out.println(b);

		}
		for (byte b = 1; b <127; b++) {// b++=(byte)(b+1); // 1 to 126 

			System.out.println(b);

		}
	}

}
