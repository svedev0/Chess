package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Knight extends Piece {

	public Knight(Color c) {
		super(c);
	}

	public void showMove(int x, int y) {

		// Up Right
		if (y - 2 >= 0 && x + 1 < 8) {
			Square s1 = ChessBoard.getSquare(x + 1, y - 2);
			s1.moveMark();
		}

		// Up Left
		if (y - 2 >= 0 && x - 1 >= 0) {
			Square s1 = ChessBoard.getSquare(x - 1, y - 2);
			s1.moveMark();
		}

		// Left Up
		if (y + 1 < 8 && x + 2 < 8) {
			Square s1 = ChessBoard.getSquare(x - 1, y - 2);
			s1.moveMark();
		}

		// Left Down
		if (y - 2 >= 0 && x - 1 <= 0) {
			Square s1 = ChessBoard.getSquare(x - 1, y - 2);
			s1.moveMark();
		}
		
		//Finish rest of these

	}

	public void hideMove() {

	}
}