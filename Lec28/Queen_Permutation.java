package Lec28;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];

		permutaton(board, 2, 0, "");
	}

	public static void permutaton(boolean[] board, int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
		
		for (int i = 0; i < board.length; i++) {
			if(!board[i]) {
				board[i]=true;//do
				
				permutaton(board, tq, qpsf+1, ans+"b"+i+"Q"+qpsf+" ");//work
				board[i]=false;//undo
				
			}
			
			
			
			
		}
		
		
		
		

	}

}
