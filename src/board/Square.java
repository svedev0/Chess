package board;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import pieces.Pawn;
import pieces.Piece;

public class Square extends Group {

	public static final double SIZE = 80;
	private Rectangle bg;
	private Color originalColor;
	private Piece piece;
	public static Square active;
	@SuppressWarnings("unused")
	private int turnCounter = 1;
	public static ArrayList<Square> marked = new ArrayList<Square>();

	public Square(Color c) {
		originalColor = c;
		bg = new Rectangle(SIZE, SIZE, c);
		this.getChildren().add(bg);
		
		this.setOnMouseClicked(event -> {
		
			if (hasPiece()) {
				makeActive();
				
				int row = row();
				int col = col();
				
				if (this.piece instanceof Pawn) {
					if (this.piece.getColor() == Color.BLACK) {
						ChessBoard.all_squares.get(row+1).get(col).moveMark();
						ChessBoard.all_squares.get(row+2).get(col).moveMark();
					}
					else if (this.piece.getColor() == Color.WHITE) {
						ChessBoard.all_squares.get(row-1).get(col).moveMark();
						ChessBoard.all_squares.get(row-2).get(col).moveMark();
					}
				}
			}
			else {
				if (active != null) {	
				active.makeInactive();
				}
				moveMark();
			}
		});
	}
	
	private int col() {
		for (int i = 0; i < ChessBoard.all_squares.size(); i++) {
			if (ChessBoard.all_squares.get(i).contains(this)) {
				return ChessBoard.all_squares.get(i).indexOf(this);
			}
		}
		return -1;
	}

	public int row() {
		for (int i = 0; i < ChessBoard.all_squares.size(); i++) {
			if (ChessBoard.all_squares.get(i).contains(this)) {
				return i;
			}
		}
		return -1;
	}
	
	public void moveMark() {
		Circle cir = new Circle(SIZE/2, SIZE/2, SIZE/10, Color.YELLOW);
		this.getChildren().add(cir);
		marked.add(this);
	}

	private void removeMoveMark() {
		this.getChildren().remove(1);
	}

	private void makeActive() {
		if (active != null) {
			active.makeInactive();
		}
		active = this;
		this.getBackground().setFill(Color.GREEN);
	}

	private void makeInactive() {
		for (Square square : marked) {
			square.removeMoveMark();
		}
		marked.clear();
		active = null;
		this.getBackground().setFill(originalColor);
	}

	public void addPiece(Piece p) {
		this.piece = p;
		this.getChildren().add(p);
	}

	public boolean hasPiece() {
		return this.piece != null;
	}

	public Rectangle getBackground() {
		return this.bg;
	}
	
	public Boolean turn(int i) {
		boolean whiteTurn = true;
		if (i % 2 == 0){
			return whiteTurn = false;
		}
		else {
		return whiteTurn;
		}
	}
}