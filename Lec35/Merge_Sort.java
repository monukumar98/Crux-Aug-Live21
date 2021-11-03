package Lec35;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 4, 1, 11, 9, 3 };

		int [] ans= Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int [] Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}

		int mid = (ei + si) / 2;
		int[] fs = Sort(arr, si, mid);
		int[] ss = Sort(arr, mid + 1, ei);
		return MergeTwoSorted(fs, ss);

	}

	public static int[] MergeTwoSorted(int[] arr1, int[] arr2) {

		int[] ans = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				ans[k] = arr2[j];
				j++;
				k++;
			} else {
				ans[k] = arr1[i];
				i++;
				k++;
			}

		}

		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;

	}

}
