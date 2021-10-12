package Lec27;

public class Doubt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		split_array(arr, 0, 0, 0, "", "");
	}

	private static void  split_array(int[] arr, int sum1, int sum2, int i, String ans1, String ans2) {
		if(i==arr.length) {
			if(sum1==sum2) {
				
			}
			
		}
		
		// TODO Auto-generated method stub
		split_array(arr, sum1+arr[i], sum2, i+1, ans1+arr[i], ans2);// 1st ka yes and 2st no call
		split_array(arr, sum1, sum2+arr[i], i+1, ans1, ans2+arr[i]);//1st ka no call  and 2nd yes call
		
		
		
		
	}

}
