package Lec54;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 203, 67, 78, 90 };
		Dispaly(arr);
		String[] sarr = { "ssj", "shs", "ram" };
		Dispaly(sarr);

	}

	public static <T>void Dispaly(T [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	

}
