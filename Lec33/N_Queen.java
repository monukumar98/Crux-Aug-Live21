package Lec33;


public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		NQueen(board, 4, 0);

	}

	public static void NQueen(boolean[][] board, int tq, int row) {
		// TODO Auto-generated method stub
		if (tq == 0) {
			display(board);
			System.out.println();
			return;

		}
		if (row == board.length) {
			return;
		}
		

		for (int col = 0; col < board.length; col++) {
		
			if (is_it_possible(board, row, col)) {
				
				board[row][col] = true;
				NQueen(board, tq - 1, row + 1);
				board[row][col] = false;

			}

		}

	}

	public static boolean is_it_possible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub

		// Row

		int r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}

		// Right Diagonal
		r = row;
		int c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
		// Left Diagonal 
		r =row;
		c=col;
		while(r>=0 && c>=0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		return true;

	}

	public static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");

			}
			System.out.println();
		}

	}

}
