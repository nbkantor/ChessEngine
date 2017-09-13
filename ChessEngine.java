public class ChessEngine{
	public ChessBoard board;
	Player p1, p2;
	private int observationTimeInMilliseconds = 100;

	public static void main(String[] args){
			ChessEngine engine = new ChessEngine();

			p1 = new ChessPlayer();
			p2 = new ChessPlayer();

			ChessBoard board = new ChessBoard(p1,p2);

			if(p1.isWhite())
				System.out.println("P1 is white");
			else
				System.out.println("P1 is black");
			

			board.initBoard();

	}


	private void playLoop(){
		while(true){ // TODO use threads
			p1.play(board);
			Thread.sleep(observationTimeInMilliseconds);
			printBoard();
			p2.play(board);
			Thread.sleep(observationTimeInMilliseconds);
			printBoard();
		}
	}

	public void printBoard(){
		for(int i=0; i!= 8; ++i){
			for(int j = 0; j!= 8; ++j){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}