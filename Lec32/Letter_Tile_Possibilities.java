package Lec32;

public class Letter_Tile_Possibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="AAB";
        int freq [] = new int [26];
        for (int i = 0; i <str.length(); i++) {
        	char ch = str.charAt(i);
        	freq[ch-'A']++;
        	
			
		}
       System.out.println(Tile_Possibilities(freq, ""));
        
	}
	public static int  Tile_Possibilities(int [] freq, String ans) {
		 int res=0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]>0) {
				freq[i]--;
				char ch = (char) ('A'+i);
				res+=Tile_Possibilities(freq, ans+ch) +1;
				freq[i]++;
				
				
			}
			
		}
		return res;
		
		
		
	}

}
