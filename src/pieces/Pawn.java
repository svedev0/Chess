package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Pawn extends Piece {
	
	public Pawn(Color c) {
		super(c);
	}

	public void showMove(int x, int y) {
		if (this.getColor() == Color.WHITE ) {
			ChessBoard.getSquare(x, y + 1).moveMark();
			ChessBoard.getSquare(x, y + 2).moveMark();
		}
		else {
		ChessBoard.getSquare(x, y - 1).moveMark();
		ChessBoard.getSquare(x, y - 2).moveMark();
		}
	}

	public void hideMove() {
		
	}	
}