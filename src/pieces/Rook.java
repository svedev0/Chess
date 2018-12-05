package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Rook extends Piece {

	@SuppressWarnings("unused")
	private boolean hasMoved = false;

	public Rook(Color c) {
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
	}

	public void move() {
		hasMoved = true;
	}

	public void hideMove() {

	}
}