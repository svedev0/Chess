package pieces;

import javafx.scene.paint.Color;

public class Rook extends Piece {
	@SuppressWarnings("unused")
	private boolean hasMoved;

	public Rook(Color c) {
		super(c);
		hasMoved = false;
	}

	@Override
	public void move() {
		hasMoved = true;
	}

	@Override
	public void showMove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hideMove() {
		// TODO Auto-generated method stub

	}
}
