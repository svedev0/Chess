package pieces;

import board.Square;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public abstract class Piece extends Group implements Moveable {

	private Color color;

	public Piece(Color c) {
		
		this.color = c;

		String COLOR = "WHITE";
		if (c == Color.BLACK) {
			COLOR = "BLACK";
		}

		Image img = new Image("/images/" + COLOR + "_" + this.getClass().getSimpleName().toUpperCase() + ".png");
		ImageView iv = new ImageView(img);
		iv.setFitWidth(Square.SIZE);
		iv.setFitHeight(Square.SIZE);
		this.getChildren().add(iv);
	}

	public void move() {

	}

	public Color getColor() {
		return this.color;
	}
}
