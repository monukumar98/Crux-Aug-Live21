package Lec58;

public class Uniq_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,2,5,3,5,7};
		System.out.println(Unqione(arr));

	}

	private static int  Unqione(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans= ans^arr[i];
		}
		return ans;
		
	}
	

}
