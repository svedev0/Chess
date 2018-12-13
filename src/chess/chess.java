package chess;

import board.ChessBoard;
import board.Square;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class chess extends Application {

	public static Stage window;
	Scene menuScene, gameScene;
	
	private static Scene gameOverScreen;
	private static Scene winScreen;	


	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;

		// Menu----------------------------------------------------------

		Label gameName = new Label("Chess Game");
		Button startButton = new Button("Start");
		Button exitButton = new Button("Exit");

		String style1 = "-fx-font-size: 3em;";
		String style2 = "-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-size: 1.9em; -fx-padding: 10px;";

		gameName.setStyle(style1);
		startButton.setStyle(style2);
		exitButton.setStyle(style2);

		VBox menuVBox = new VBox(40);
		menuVBox.setAlignment(Pos.CENTER);

		menuVBox.getChildren().addAll(gameName, startButton, exitButton);

		Scene menuScene = new Scene(menuVBox, Square.SIZE * 8 - 10, Square.SIZE * 8 - 10);

		// Game----------------------------------------------------------

		ChessBoard board = new ChessBoard();
		Scene gameScene = new Scene(board, Square.SIZE * 8, Square.SIZE * 8);

		// Win----------------------------------------------------------

		Label win = new Label("CONGRATULATIONS, YOU WIN!");

		win.setStyle(style1);

		VBox winVBox = new VBox(40);
		winVBox.setAlignment(Pos.CENTER);

		winVBox.getChildren().add(win);

		winScreen = new Scene(winVBox, Square.SIZE * 8, Square.SIZE * 8, Color.BLACK);

		startButton.setOnAction(e -> primaryStage.setScene(gameScene));
		exitButton.setOnAction(e -> System.exit(0));

		// Game Over----------------------------------------------------------

		Label gameOverLabel = new Label("GAME OVER");

		String style3 = "-fx-font-size: 3em;";

		gameOverLabel.setStyle(style3);

		VBox gameOverVBox = new VBox(40);
		gameOverVBox.setAlignment(Pos.CENTER);

		gameOverVBox.getChildren().add(gameOverLabel);

		gameOverScreen = new Scene(gameOverVBox, Square.SIZE * 8, Square.SIZE * 8, Color.BLACK);

		window.getIcons().add(new Image("file:/images/WHITE_KING.png"));
		window.setTitle("Chess Game");
		window.setResizable(false);
		window.setScene(menuScene);
		window.show();
	}

	public static void gameOver() {
		window.setScene(gameOverScreen);
	}

	public static void win() {
		window.setScene(winScreen);
	}
}
