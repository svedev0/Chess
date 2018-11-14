package board;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

public class ChessBoard extends Group {

	public static ArrayList<ArrayList<Square>> all_squares = new ArrayList<ArrayList<Square>>();
	
	public ChessBoard() {

		for (int row = 0; row < 8; row++) {
			ArrayList<Square> arrRow = new ArrayList<Square>();
			for (int col = 0; col < 8; col++) {

				Color bg = Color.SANDYBROWN;
				if ((row + col) % 2 == 0) {
					bg = Color.WHITE;
				}

				
				
				Square s = new Square(bg);
				s.setTranslateX(col * Square.SIZE);
				s.setTranslateY(row * Square.SIZE);
				this.getChildren().add(s);
				arrRow.add(s);
				
				//PAWNS
				if(row == 1){
					s.addPiece(new Pawn(Color.BLACK));
				}
				
				if(row == 6){
					s.addPiece(new Pawn(Color.WHITE));
				}
				
				//ROOKS
				if(row == 0){
					if(col == 0 || col == 7){
						s.addPiece(new Rook(Color.BLACK));
					}
				}
				if(row == 7){
					if(col == 0 || col == 7){
						s.addPiece(new Rook(Color.WHITE));
					}
				}
				
				//KNIGHTS
				if(row == 0){
					if(col == 1 || col == 6){
						s.addPiece(new Knight(Color.BLACK));
					}
				}
				if(row == 7){
					if(col == 1 || col == 6){
						s.addPiece(new Knight(Color.WHITE));
					}
				}
				
				//BISHOPS
				if(row == 0){
					if(col == 2 || col == 5){
						s.addPiece(new Bishop(Color.BLACK));
					}
				}
				if(row == 7){
					if(col == 2 || col == 5){
						s.addPiece(new Bishop(Color.WHITE));
					}
				}
				
				//QUEENS
				if(row == 0){
					if(col == 3){
						s.addPiece(new Queen(Color.BLACK));
					}
				}
				if(row == 7){
					if(col == 3){
						s.addPiece(new Queen(Color.WHITE));
					}
				}
				
				//KINGS
				if(row == 0){
					if(col == 4){
						s.addPiece(new King(Color.BLACK));
					}
				}
				if(row == 7){
					if(col == 4){
						s.addPiece(new King(Color.WHITE));
					}
				}
			}
			all_squares.add(arrRow);

		}
	}
}