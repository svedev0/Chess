package menu;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import board.ChessBoard;
import board.Square;

public class StartMenu extends Group {

	@SuppressWarnings("unused")
	public StartMenu() {
		Rectangle menuOverlay = new Rectangle(Square.SIZE * 8 + 10, Square.SIZE * 8 + 10, Color.BLACK);

		Button startBtn = new Button("Start");
		
		startBtn.setTranslateX(310);
		startBtn.setTranslateY(260);
		
		Button exitBtn = new Button("Exit");
		
		exitBtn.setTranslateX(310);
		exitBtn.setTranslateY(320);

		startBtn.setOnAction(event -> {
			ChessBoard board = new ChessBoard();
			Scene scene = new Scene(board, Square.SIZE * 8 - 10, Square.SIZE * 8 - 10);
		});

		exitBtn.setOnAction(event -> {
			System.exit(0);
		});

		this.getChildren().add(menuOverlay);
		this.getChildren().add(startBtn);
		this.getChildren().add(exitBtn);
	}
}
