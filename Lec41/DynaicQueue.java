package Lec41;

import Lec40.Queue;

public class DynaicQueue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {

		if (this.IS_full()) {

			int[] newarr = new int[2 * this.arr.length];

			for (int i = 0; i < this.arr.length; i++) {
				int idx = (this.front + i) % this.arr.length;
				newarr[i] = arr[idx];

			}

			this.arr = newarr;
			this.front = 0;
		}
	   super.Enqueue(item);

	}

}
