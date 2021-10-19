package Lec29;
import java.util.*;
public class String_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String [] word = new String[n];
		for (int i = 0; i < word.length; i++) {
			word[i]=sc.next();
		}
		Sort(word);
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}
	public static void Sort(String[]word) {
		for (int pass = 1; pass < word.length; pass++) {
			for (int j = 0; j < word.length-pass; j++) {
				if(ToCompare(word[j],word[j+1])>0) {
					String temp = word[j];
					word[j]=word[j+1];
					word[j+1]=temp;
				}
			}
		}
}
	
	public static int ToCompare(String s1, String s2) {
		int i = 0;
		int j = 0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)>s2.charAt(j)) {
				return 1;
			}
			else if(s1.charAt(i)<s2.charAt(j)) {
				return -1;
			}
			i++;
			j++;
		}
		
		return  s2.length()-s1.length();
			
		
	}
	
}