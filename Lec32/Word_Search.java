package Lec32;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "ABCCED";
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		boolean ans = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(word.charAt(0)!=board[i][j]){
                    continue;
                }
				ans = WordSearch(board, i, j, word, 0);
				if (ans) {
					System.out.println(ans);
					return;
				}
			}
		}

	}

	public static boolean WordSearch(char[][] board, int cr, int cc, String Word, int idx) {

		if (idx == Word.length()) {
			return true;
		}

		if (cr < 0 || cr >= board.length || cc < 0 || cc > board[0].length || board[cr][cc] != Word.charAt(idx)) {
			return false;
		}

		int[] r = { -1, 0, 0, 1,-1,1, 1-1};
		int[] c = { 0, 1, -1, 0,1,1,-1 ,-1};
		boolean ans = false;
		board[cr][cc] = '*';
		for (int i = 0; i < c.length; i++) {
			ans = WordSearch(board, cr + r[i], cc + c[i], Word, idx + 1);
			if (ans) {
				return ans;
			}

		}
		board[cr][cc] = Word.charAt(idx);
		return ans;

	}

}
