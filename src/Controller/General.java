package Controller;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class General extends Application {
	static Stage start;
	static Stage loginNormalUser;
	static Stage loginAdmin;

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
			
			loginNormalUser = new Stage();
			URL second = getClass().getClassLoader().getResource("LoginNormalUser.fxml");
			Parent rootSecond = FXMLLoader.load(second);
			Scene secondScene = new Scene(rootSecond);
			loginNormalUser.setTitle("LoginNormalUser");
			loginNormalUser.setScene(secondScene);
			
			loginAdmin = new Stage();
			URL third = getClass().getClassLoader().getResource("LoginAdmin.fxml");
			Parent rootThird = FXMLLoader.load(third);
			Scene thirdScene = new Scene(rootThird);
			loginAdmin.setTitle("LoginAdmin");
			loginAdmin.setScene(thirdScene);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Inicio() {
		launch(null);
	}
}
