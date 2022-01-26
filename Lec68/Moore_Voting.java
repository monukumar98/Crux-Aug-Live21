package Lec68;

public class Moore_Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 8, 7, 7, 7 };

	}

	public int majorityElement(int[] nums) {

		int count = 1;
		int e = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != e) {
				count--;
				if (count == 0) {
					count = 1;
					e = nums[i];
				}
			} else {
				count++;
			}

		}

		return e;
	}

}
