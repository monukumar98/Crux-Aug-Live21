package Lec59;

public class Unique_Number_2 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 3, 4, 6, 7, 6 };// 2 and 7
		UniqueNumber2(arr);

	}

	public static void UniqueNumber2(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		// ans = 101100100
	    int mask=(ans&(~(ans-1)));//100
	    int a=0;
	    for (int i = 0; i < arr.length; i++) {
	    	if((arr[i]&mask) !=0) {
	    		a^=arr[i];
	    	}
			
		}
	    int b = ans^a;
	    System.out.println(a+" "+b);

	}

}
