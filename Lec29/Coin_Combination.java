package Lec29;
import java.util.*;


public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		coinCombination(coin, amount,  0,list,ans);
		System.out.println(ans);
	}
	
	public static void coinCombination(int[] coin, int amount,int idx,List<Integer> list ,List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if(amount==0) {
			//System.out.println(list);
		//	 ans.add(list);
//			List<Integer> bs = new ArrayList<Integer>();
//			for (int i = 0; i <list.size(); i++) {
//				bs.add(list.get(i));
//				
//			}
			ans.add(new ArrayList<>(list));
			return;
		}
		
		
		for (int i = idx; i < coin.length; i++) {
			
			if(amount>=coin[i]) {
				amount-=coin[i];// Cap
				//coinpermutation(coin, amount-coin[i],ans+coin[i]);// no backtracking 
                 list.add(coin[i]);
				coinCombination(coin, amount,i,list,ans);
				list.remove(list.size()-1);
				amount+=coin[i];// Cap Remove
			}
			
		}
		
		

	}


}
