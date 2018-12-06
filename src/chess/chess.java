package chess;

import board.ChessBoard;
import board.Square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class chess extends Application {
	
	Stage window;
	Scene menuScene, gameScene;
	
	public static void main(String[] args) {
		launch();
	}

	@SuppressWarnings("unused")
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		
		Label label1 = new Label("Chess Game");
		Button startBtn = new Button("Start");
		Button exitBtn = new Button("Exit");
		
		startBtn.setOnAction(e -> window.setScene(gameScene));
		exitBtn.setOnAction(e -> System.exit(0));
		
		VBox layout1 = new VBox(20);
		
		layout1.getChildren().addAll(label1, startBtn, exitBtn);
		
		Scene menuScene = new Scene(layout1, 500, 500);

		ChessBoard board = new ChessBoard();
		Scene gameScene = new Scene(board, Square.SIZE * 8 - 10, Square.SIZE * 8 - 10);

		primaryStage.getIcons().add(new Image("file:/images/WHITE_KING.png"));
		primaryStage.setTitle("Chess Game");
		primaryStage.setResizable(false);
		primaryStage.setScene(menuScene);
		primaryStage.show();
	}
}
