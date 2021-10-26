package Lec32;

public class Normal_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] maze = new boolean[4][4];
		System.out.println(countpath(maze, 0, 0));
		

	}
	public static int countpath(boolean [][]maze,int cr,int cc) {
		
		if(cr==maze.length-1 && cc== maze[0].length-1) {
			return 1;
		}
		
		if(cr<0 || cr>=maze.length || cc<0  || cc>=maze[0].length || maze[cr][cc]==true) {
			return 0;
		}
		
		
		int []r= {-1,0,0,1};
		int [] c= {0,1,-1,0};
		int ans=0;
		maze[cr][cc]=true;// visited
		for (int i = 0; i < c.length; i++) {
			ans+=countpath(maze, cr+r[i], cc+c[i]);
		}
		maze[cr][cc]=false;// undo 
		return ans;
		
		
	}

}
