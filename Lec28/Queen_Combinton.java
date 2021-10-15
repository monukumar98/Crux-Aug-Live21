package Lec28;

public class Queen_Combinton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination(new boolean[4], 2, 0, "", 0);
		

	}
	public static void combination(boolean[] board, int tq, int qpsf, String ans,int last_idx) {
		// TODO Auto-generated method stub
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
		
		for (int i = last_idx; i < board.length; i++) {
			if(!board[i]) {
				board[i]=true;//do
				
				combination(board, tq, qpsf+1, ans+"b"+i+"Q"+qpsf+" ",i);//work
				board[i]=false;//undo
				
			}
			
			
			
			
		}
		
		
		
		

	}

}
