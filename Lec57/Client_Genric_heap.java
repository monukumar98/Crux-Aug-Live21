package Lec57;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Client_Genric_heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars []car = new Cars[5];

		car[0] = new Cars(200, 10, "White");
		car[1] = new Cars(1000, 20, "Black");
		car[2] = new Cars(345, 3, "Yellow");
		car[3] = new Cars(34, 89, "Grey");
		car[4] = new Cars(8907, 6, "Red");
		//Generic_Heap<Cars> gp = new Generic_Heap<>();
		PriorityQueue<Cars> gp = new PriorityQueue<>(new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		gp.add(car[0]);
		gp.add(car[1]);
		gp.add(car[2]);
		gp.add(car[3]);
		gp.add(car[4]);
		//gp.display();
		
		

	}

}
