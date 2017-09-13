import java.util.ArrayList;

public class ChessBoard{

	private Square[][] squares;
	private ArrayList<ChessPiece> graveyard;

	private void initBoard(Player p1, Player p2){

		// ['R']['N']['B']['Q']['K']['B']['N']['R']
		// ['P']['P']['P']['P']['P']['P']['P']['P']
		// ['']['']['']['']['']['']['']['']
		// ['']['']['']['']['']['']['']['']
		// ['']['']['']['']['']['']['']['']
		// ['']['']['']['']['']['']['']['']
		// ['P']['P']['P']['P']['P']['P']['P']['P']
		// ['R']['N']['B']['Q']['K']['B']['N']['R']


			//pawns
		// for(int i = 0; i!= 8; ++i)
		// 	for(int j = 0; j!= 8; ++j)
		// 		squares[i][j] = new Square(i,j,this);

		
		// for (int column= 0; column!= 8; ++column){
		// 	squares[1][column] = new Pawn();
		// 	board[6][column] = 'P';

		// }


		//white pieces
		// piecesInPlay[0][0] = new Rook(p1);
		// piecesInPlay[0][1] = new Knight('W');
		// piecesInPlay[0][2] = new Bishop('W');
		// piecesInPlay[0][3] =  new Queen('W');
		squares[0][4].setPiece(new King(p1, 0, 5, this));
		// piecesInPlay[0][5] =  new Bishop('W');
		// piecesInPlay[0][6] =  new Knight('W');
		// piecesInPlay[0][7] =  new Rook('W');

		//black pieces
		// piecesInPlay[7][0] = new Rook('B');
		// piecesInPlay[7][1] = new Knight('B');
		// piecesInPlay[7][2] = new Bishop('B');
		// piecesInPlay[7][3] = new Queen('B');
		squares[7][4].setPiece(new King(p2,7,5,this));
		// piecesInPlay[7][5] = new Bishop('B');
		// piecesInPlay[7][6] = new Knight('B');
		// piecesInPlay[7][7] = new Rook('B');
		printBoard();
	}

	public Square getSquare(int row, int col){
		if(row > 7 || row <0 || col>7 || col <7)
			return null;

		return squares[row][col];//TODO test
	}
}