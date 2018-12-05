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
		if (x + 1 < 8 && y + 2 < 8) {
			Square s1 = ChessBoard.getSquare(x + 1, y + 2);
			s1.moveMark();
		}

		// Right Up
		if (x + 2 < 8 && y + 1 < 8) {
			Square s1 = ChessBoard.getSquare(x + 2, y + 1);
			s1.moveMark();
		}

		// Right Down
		if (x + 2 < 8 && y - 1 >= 0) {
			Square s1 = ChessBoard.getSquare(x + 2, y - 1);
			s1.moveMark();
		}

		// Down Right
		if (x + 1 < 8 && y - 2 >= 0) {
			Square s1 = ChessBoard.getSquare(x + 1, y - 2);
			s1.moveMark();
		}

		// Down Left
		if (x - 1 >= 0 && y - 2 >= 0) {
			Square s1 = ChessBoard.getSquare(x - 1, y - 2);
			s1.moveMark();
		}

		// Left Down
		if (x - 2 >= 0 && y - 1 >= 0) {
			Square s1 = ChessBoard.getSquare(x - 2, y - 1);
			s1.moveMark();
		}

		// Left Up
		if (x - 2 >= 0 && y + 1 < 8) {
			Square s1 = ChessBoard.getSquare(x - 2, y + 1);
			s1.moveMark();
		}

		// Up Left
		if (x - 1 >= 0 && y + 2 < 8) {
			Square s1 = ChessBoard.getSquare(x - 1, y + 2);
			s1.moveMark();
		}
	}

	public void hideMove() {

	}
}