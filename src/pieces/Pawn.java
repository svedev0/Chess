package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Pawn extends Piece {

	private boolean hasMoved = false;

	public Pawn(Color c) {
		super(c);
	}

	public void showMove(int x, int y) {
		if (this.getColor() == Color.WHITE) {
			Square s1 = ChessBoard.getSquare(x, y - 1);
			if (!s1.hasPiece()) {
				s1.moveMark();
			} else {
				return;
			}
			if (!hasMoved) {
				Square s2 = ChessBoard.getSquare(x, y - 2);
				if (!s2.hasPiece()) {
					s2.moveMark();
				} else {
					return;
				}
			}
		} else {
			Square s1 = ChessBoard.getSquare(x, y + 1);
			if (!s1.hasPiece()) {
				s1.moveMark();
			}
			if (!hasMoved) {
				Square s2 = ChessBoard.getSquare(x, y + 2);
				if (!s2.hasPiece()) {
					s2.moveMark();
				}
			}
		}

		// White Right Up
		if (this.getColor() == Color.WHITE) {
			Square s3 = ChessBoard.getSquare(x + 1, y - 1);
			if (s3.hasPiece()) {
				s3.attackMark();
			}

			// White Left Up
			Square s5 = ChessBoard.getSquare(x - 1, y - 1);
			if (s5.hasPiece()) {
				s5.attackMark();
			} else {
				return;
			}
		}

		// Black Right Down
		if (this.getColor() == Color.BLACK) {
			Square s4 = ChessBoard.getSquare(x + 1, y + 1);
			if (s4.hasPiece()) {
				s4.attackMark();
			}
			
			// Black Left Down
			Square s3 = ChessBoard.getSquare(x - 1, y + 1);
			if (s3.hasPiece()) {
				s3.attackMark();
			} else {
				return;
			}
		}
	}

	public void move() {
		hasMoved = true;
	}

	public void hideMove() {

	}
}