package Lec55;

import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = new int [5];
		Cars[] car = new Cars[5];

		car[0] = new Cars(200, 10, "White");
		car[1] = new Cars(1000, 20, "Black");
		car[2] = new Cars(345, 3, "Yellow");
		car[3] = new Cars(34, 89, "Grey");
		car[4] = new Cars(8907, 6, "Red");

		Display(car);
		System.out.println("***************");
		// BubbleSort(car);
		//BubbleSort(car, new CarCompareterSpeed());
		//BubbleSort(car, new CarComparaterColor());
		BubbleSort(car, new CarCOmparaterPrice());
		Display(car);

	}

	public static <T> void Display(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
	}
//
//	public static <T extends Comparable<T>> void BubbleSort(T[] arr) {
//		for (int pass = 1; pass < arr.length; pass++) {// pass<=arr.lenght-1
//			for (int j = 0; j < arr.length - pass; j++) {
//				if (arr[j].compareTo(arr[j + 1]) > 0) {
//					T temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//	}

	public static <T> void BubbleSort(T[] arr, Comparator<T> camp) {
		for (int pass = 1; pass < arr.length; pass++) {// pass<=arr.lenght-1
			for (int j = 0; j < arr.length - pass; j++) {
				if (camp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
