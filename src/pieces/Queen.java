package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Queen extends Piece {

	public Queen(Color c) {
		super(c);
	}

	public void showMove(int x, int y) {
		
		// Left
		for (int i = 1; i < 8; i++) {
			if (x - i < 0) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x - i, y);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Right
		for (int i = 1; i < 8; i++) {
			if (x + i > 7) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x + i, y);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Up
		for (int i = 1; i < 8; i++) {
			if (y - i < 0) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x, y - i);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Down
		for (int i = 1; i < 8; i++) {
			if (y + i > 7) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x, y + i);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Up Left
		for (int i = 1; i < 8; i++) {
			if (x - i < 0 || y - i < 0) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x - i, y - i);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Up Right
		for (int i = 1; i < 8; i++) {
			if (x + i > 7 || y - i < 0) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x + i, y - i);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Down Left
		for (int i = 1; i < 8; i++) {
			if (x + i > 7 || y + i > 7) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x + i, y + i);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}

		// Down Right
		for (int i = 1; i < 8; i++) {
			if (x - i < 0 || y + i > 7) {
				break;
			}
			Square s1 = ChessBoard.getSquare(x - i, y + i);
			if (!s1.hasPiece()) {
				s1.mark(getColor());
			} else {
				s1.mark(getColor());
				break;
			}
		}
	}

	public void hideMove() {

	}
}