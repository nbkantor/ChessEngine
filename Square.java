public class Square{
	public ChessPiece myPiece;
	public ArrayList<ChessPiece> attackingPieces; //pieces that can attack this square
	private ChessBoard board;
	private int row, col;

	public Square(int row, int col, ChessBoard chessboard){
		this.row = row;
		this.col = col;
		this.board = chessboard;
		attackingPieces = new ArrayList<ChessPiece>();
	}

	public ChessPiece getPiece(){
		return myPiece;
	}
	public void setPiece(ChessPiece newPiece){
		myPiece = newPiece;
	}

	public Square getUp(){
		return board.getSquare(row-1, col);
	}
	public Square getUpRight(){
		return board.getSquare(row-1, col+1);
	}
	public Square getUpLeft(){
		return board.getSquare(row-1, col-1);
	}
	public Square getLeft(){
		return board.getSquare(row, col-1);
	}
	public Square getRight(){
		return board.getSquare(row, col+1);
	}
	public Square getDown(){
		return board.getSquare(row+1, col);
	}
	public Square getDownLeft(){
		return board.getSquare(row+1, col-1);
	}
	public Square getDownRight(){
		return board.getSquare(row+1, col+1);
	}
	public ArrayList<Square> getAdjacentSquares(){
		ArrayList<Square> adjacentSquares = new ArrayList<Square>();
		adjacentSquares.add(getUp());
		adjacentSquares.add(getUpRight());
		adjacentSquares.add(getUpLeft());
		adjacentSquares.add(getLeft());
		adjacentSquares.add(getRight());
		adjacentSquares.add(getDown());
		adjacentSquares.add(getDownLeft());
		adjacentSquares.add(getDownRight());
	}

	public boolean ownedBy(Player p){
		return p == myPiece.getPlayer();
	}

	public boolean whiteOwned(){
		return myPiece.getPlayer().isWhite();
	}
	public boolean blackOwned(){
		return myPiece.getPlayer().isBlack();
	}

	public boolean ThreatenedByEnemy(Player currentPlayer){
		if(currentPlayer.isWhite()){
			return blackThreatened();
		}
		else{
			return whiteThreatened();
		}
	}
	public boolean whiteThreatened(){
		for(ChessPiece cp: attackingPieces){
			if(cp.isWhite())
				return true;
		}
		return false;
	}
	public boolean blackThreatened(){
		for(ChessPiece cp: attackingPieces){
			if(cp.isBlack())
				return true;
		}
		return false;
	}
}