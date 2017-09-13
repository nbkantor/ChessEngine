import java.util.*;
import java.awt.Image.*;

public class King extends ChessPiece{
	public BufferedImage myImage;

	@Override
	public King(ChessPlayer p, int initialRow, int initialColumn, ChessBoard cb){
		owner = p;
		row = initialRow;
		column = initialColumn;
		board = cb;
	}

	@Override
	public ArrayList<Move> getLegalMoves(){
		ArrayList<Square> adjacentSquares = new ArrayList<Square>();

		adjacentSquares.add(mySquare.getAdjacentSquares());
		ArrayList<Square> legalSquares = new ArrayList<Square>();
		for(Square square: adjacentSquares){
			if(square.ownedBy(this.ownedBy())){
				//do nothing
			}
			else if(square.ThreatenedByEnemy(this.owner)){
				//do nothing
			}
			else{
				legalSquares.add(square);
			}
		}
		ArrayList<Move> legalMoves = new ArrayList<Move>();
		for(Square s: legalSquares){
			legalMoves.add(new Move(this, s));
		}

		return legalMoves;
	}

	public char getCharacterRepresentation(){
		return 'K';
	}

	public BufferedImage get2DRepresentation(){
		return myImage;
	}
}