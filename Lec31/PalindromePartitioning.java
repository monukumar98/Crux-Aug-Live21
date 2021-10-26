package Lec31;

import java.util.*;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
	//	Palindrome_Partitioning("nitin", "");
		Palindrome_Partitioning_leetcode("nitin", list, ans);
		System.out.println(ans);

	}

	public static void Palindrome_Partitioning(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
		}

		for (int i = 1; i <= ques.length(); i++) {
			String p1 = ques.substring(0, i);
			if (Partitioning(p1)) {
				String p2 = ques.substring(i);
				Palindrome_Partitioning(p2, ans + p1 + "|");
			}

		}
	}

	public static boolean Partitioning(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;

			}
			i++;
			j--;

		}
		return true;

	}

	public static void Palindrome_Partitioning_leetcode(String ques, List<String> list, List<List<String>> ans) {
		if (ques.length() == 0) {
			ans.add(new ArrayList<>(list));
			return ;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String p1 = ques.substring(0, i);
			if (Partitioning(p1)) {
				String p2 = ques.substring(i);
				list.add(p1);
				Palindrome_Partitioning_leetcode(p2, list, ans);
				list.remove(list.size() - 1);
			}

		}
	}

}
