package Lec25;

import java.util.*;



public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GenerateParentheses(3, 0, 0, "");
		List<String> list = new ArrayList<>();
		GenerateParentheses_Leetcode(3, 0, 0, "", list);
		System.out.println(list);

	}

	public static void GenerateParentheses(int n, int open, int close, String ans) {
        if(open==n && close==n) {
        	System.out.println(ans);
        	return;
        }
		
		// opening
		if (open < n) {
			GenerateParentheses(n, open + 1, close, ans + "(");
		}
		// closing
		if (close < open) {
			GenerateParentheses(n, open, close + 1, ans + ")");
		}
	}

	public static void GenerateParentheses_Leetcode(int n, int open, int close, String ans,List<String> list) {
        if(open==n && close==n) {
        	list.add(ans);
        	return;
        }
		
		// opening
		if (open < n) {
			GenerateParentheses_Leetcode(n, open + 1, close, ans + "(",list);
		}
		// closing
		if (close < open) {
			GenerateParentheses_Leetcode(n, open, close + 1, ans + ")",list);
		}
	}

}
