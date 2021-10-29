package Lec34;

public class Count_Numbers_with_Unique_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNumbersWithUniqueDigits(3));

	}
	
	
	 public static  int countNumbersWithUniqueDigits(int n) {
		 if(n==0) {
			 return 1;
		 }
		 
		 int diff_num=9;
		 for(int i=2; i<=n; i++) {
			 diff_num=(11-i)*diff_num;
		 }
		 return diff_num+countNumbersWithUniqueDigits(n-1);
	       
	        
	    }

}
