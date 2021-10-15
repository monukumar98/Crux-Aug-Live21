package Lec28;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		coinpermutation(coin, amount, "");

	}

	public static void coinpermutation(int[] coin, int amount, String ans) {
		// TODO Auto-generated method stub
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		
		for (int i = 0; i < coin.length; i++) {
			
			if(amount>=coin[i]) {
				amount-=coin[i];
				//coinpermutation(coin, amount-coin[i],ans+coin[i]);// no backtracking 

				coinpermutation(coin, amount,ans+coin[i]);
				amount+=coin[i];
			}
			
		}
		
		

	}

}
