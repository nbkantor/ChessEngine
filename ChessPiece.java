public class ChessPiece{
	protected ChessPlayer owner;
	protected ChessBoard board;
	protected int row;
	protected int column;
	protected Square mySquare;

	public ChessPiece(ChessPlayer p, int initialRow, int initialColumn, ChessBoard cb){
		owner = p;
		row = initalRow;
		column = initialColumn;
		board = cb;
	}

	public Square getSquare(){
		return mySquare;
	}

	public Player ownedBy(){
		return owner;
	}

	public boolean isWhite(){
		return owner.isWhite();
	}

	public abstract boolean isBlack(){
		return owner.isBlack();
	}

	public abstract ArrayList<Move> getLegalMoves();

	public abstract char getCharacterRepresentation();
}