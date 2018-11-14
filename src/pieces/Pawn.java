package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Pawn extends Piece {

	
	public Pawn(Color c) {
		super(c);
	}

	@Override
	public void showMove(int x, int y) {		
		ChessBoard.getSquare(x, y - 1).moveMark();
	}

	@Override
	public void hideMove() {
		
	}	
}