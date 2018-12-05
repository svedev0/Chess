package chess;

import board.ChessBoard;
import board.Square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class chess extends Application {

	public void start(Stage primaryStage) throws Exception {

		ChessBoard board = new ChessBoard();
		Scene scene = new Scene(board, Square.SIZE * 8 - 10, Square.SIZE * 8 - 10);

		primaryStage.getIcons().add(new Image("file:/images/WHITE_KING.png"));
		primaryStage.setTitle("Chess Game");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
