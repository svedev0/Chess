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

		if (this.getColor() == Color.WHITE) {
			Square diagonalSquareWhite = ChessBoard.getSquare(x + 1, y + 1);
			if (diagonalSquareWhite.hasPiece()) {
				diagonalSquareWhite.attackMark();
			}
		} else {
			Square diagonalSquareWhite = ChessBoard.getSquare(x - 1, y + 1);
			if (diagonalSquareWhite.hasPiece()) {
				diagonalSquareWhite.attackMark();
			} else {
				return;
			}
		}
		if (this.getColor() != Color.WHITE) {
			Square diagonalSquareWhite = ChessBoard.getSquare(x + 1, y - 1);
			if (diagonalSquareWhite.hasPiece()) {
				diagonalSquareWhite.attackMark();
			}
		} else {
			Square diagonalSquareWhite = ChessBoard.getSquare(x - 1, y - 1);
			if (diagonalSquareWhite.hasPiece()) {
				diagonalSquareWhite.attackMark();
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