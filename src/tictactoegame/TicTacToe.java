package tictactoegame;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char[] board = createBoard();
	}
	public static char[] createBoard() {
		char[] board= new char[10];
		for(int i=0;i<board.length;i++) {
			board[i]=' ';
		}
		return board;
	}

}
