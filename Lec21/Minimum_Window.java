package Lec21;

public class Minimum_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(MinimumWindow(s, t));

	}

	public static String MinimumWindow(String s, String t) {
		int[] freqt = new int[256];
		int[] freqs = new int[256];

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freqt[ch]++;

		}
		int count = 0;
		int ws = Integer.MAX_VALUE;
		int si = 0;
		int start =-1;
		for (int ei = 0; ei < s.length(); ei++) {
			char ch = s.charAt(ei);
			freqs[ch]++;
			if (freqt[ch] >= freqs[ch]) {
				count++;

			}
			// Window
			if (count == t.length()) {
				// Shrink

				while (freqs[s.charAt(si)] > freqt[s.charAt(si)]) {
					freqs[s.charAt(si)]--;

					si++;
				}

				if (ws > ei - si + 1) {
					ws = ei - si + 1;
					start=si;
				}

			}

		}
	
		//  
		if(start==-1) {
			return "";
		}
		
		return s.substring(start, start+ws);

	}

}
