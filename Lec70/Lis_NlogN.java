package Lec70;

public class Lis_NlogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));
	}

	public static int lis(int[] arr) {
		int[] last_ele = new int[arr.length];
		int len = 1;
		last_ele[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (last_ele[len - 1] < arr[i]) {
				last_ele[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(last_ele, 0, len - 1, arr[i]);
				last_ele[idx] = arr[i];
			}
		}
		return len;

	}

	private static int BinarySearch(int[] last_ele, int i, int j, int val) {
		// TODO Auto-generated method stub
		int lo = i;
		int hi = j;
		int idx = i;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (last_ele[mid] >= val) {
				idx = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		return idx;
	}

}
