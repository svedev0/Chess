package pieces;

import javafx.scene.paint.Color;

public class King extends Piece {
	@SuppressWarnings("unused")
	private boolean hasMoved;

	public King(Color c) {
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
