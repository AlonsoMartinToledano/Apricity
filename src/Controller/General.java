package Controller;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class General extends Application {
	static Stage start;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			start = new Stage();
			URL first = getClass().getClassLoader().getResource("Start.fxml");
			Parent rootFirst = FXMLLoader.load(first);
			Scene firstScene = new Scene(rootFirst);
			start.setTitle("Start");
			start.setScene(firstScene);
			start.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Inicio() {
		launch(null);
	}
}
