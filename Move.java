public class Move{
	private ChessPiece toMove;
	private Square endSquare;
	private Square startSquare;

	public Move(ChessPiece piece, Square endSquare){
		toMove = piece;
		this.endSquare = endSquare;
		this.startSquare = piece.getSquare();
	}

	public ChessPiece getPiece(){
		return toMove;
	}
	public Square getEndSquare(){
		return endSquare;
	}
	public Square getStartSquare(){
		return startSquare;
	}

}