package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Rook extends Piece {
	
	private boolean hasMoved = false;
	
	public Rook(Color c) {
		super(c);
	}

	public void showMove(int x, int y) {
		Square s1 = ChessBoard.getSquare(x, y);
		if (!s1.hasPiece()) {
			s1.moveMark();
		} else {
			return;
		}
		if (!hasMoved) {
			//Rokard
		}
	}

	public void move() {
		hasMoved = true;
	}
	
	public void hideMove() {
		 
	}
}