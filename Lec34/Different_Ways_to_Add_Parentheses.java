package Lec34;

import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "2*3-4*5";
		
		List<Integer> ans = diffWaysToCompute(expression);
		System.out.println(ans);
	}

	public static List<Integer> diffWaysToCompute(String expression) {
		
		if(expression.indexOf('+')==-1 && expression.indexOf('-')==-1 && expression.indexOf('*')==-1) {
		
			List<Integer> bs = new ArrayList<Integer>();
			
			bs.add(Integer.parseInt(expression));
			return bs;
			
			
		}
		


		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < expression.length(); i++) {
		
			if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
				char ch = expression.charAt(i);
				List<Integer> left = diffWaysToCompute(expression.substring(0, i));
				List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

				for (int val : left) {
					for (int val1 : right) {
						if (ch == '+') {
							ans.add(val + val1);
						}
						if (ch == '-') {
							ans.add(val - val1);
						}
						if (ch == '*') {
							ans.add(val * val1);
						}
						
					}
				}

			}

		}
		return ans;

	}
}
