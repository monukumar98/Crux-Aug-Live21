package Lec28;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_path(0, 0, 2, 2, "");// 4*5

	}

	public static void print_path(int cc, int cr, int er, int ec, String ans) {

		if(cc==ec && cr==er) {
			System.out.println(ans);
			return ;
		}
		
		
		if(cc>ec || cr>er) {
			return ;
		}
		
		print_path(cc + 1, cr, er, ec, ans + "H");
		print_path(cc, cr + 1, er, ec, ans + "V");

	}

}
