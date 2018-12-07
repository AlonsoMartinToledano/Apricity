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
	static Stage normalUserMenu;
	static Stage showAccountInformation;
	static Stage showAllCategories;
	static Stage showAllProducts;
	static Stage searchAProduct;
	static Stage changeUserPassword;
	static Stage changeUserEmail;
	static Stage adminMenu;
	static Stage increaseProductStock;
	static Stage changeAdminPassword;
	static Stage changeUserName;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			start = new Stage();
			URL first = getClass().getClassLoader().getResource("Start.fxml");
			Parent rootFirst = FXMLLoader.load(first);
			Scene firstScene = new Scene(rootFirst);
			start.setTitle("Apricity");
			start.setScene(firstScene);
			start.show();
			
			loginNormalUser = new Stage();
			URL second = getClass().getClassLoader().getResource("LoginNormalUser.fxml");
			Parent rootSecond = FXMLLoader.load(second);
			Scene secondScene = new Scene(rootSecond);
			loginNormalUser.setTitle("Apricity");
			loginNormalUser.setScene(secondScene);
			
			loginAdmin = new Stage();
			URL third = getClass().getClassLoader().getResource("LoginAdmin.fxml");
			Parent rootThird = FXMLLoader.load(third);
			Scene thirdScene = new Scene(rootThird);
			loginAdmin.setTitle("Apricity");
			loginAdmin.setScene(thirdScene);
			
			normalUserMenu = new Stage();
			URL fourth = getClass().getClassLoader().getResource("NormalUserMenu.fxml");
			Parent rootFourth = FXMLLoader.load(fourth);
			Scene fourthScene = new Scene(rootFourth);
			normalUserMenu.setTitle("Apricity");
			normalUserMenu.setScene(fourthScene);
			
			showAccountInformation = new Stage();
			URL fifth = getClass().getClassLoader().getResource("ShowAccountInformation.fxml");
			Parent rootFifth = FXMLLoader.load(fifth);
			Scene fifthScene = new Scene(rootFifth);
			showAccountInformation.setTitle("Apricity");
			showAccountInformation.setScene(fifthScene);
			
			showAllCategories = new Stage();
			URL sixth = getClass().getClassLoader().getResource("ShowAllCategories.fxml");
			Parent rootSixth = FXMLLoader.load(sixth);
			Scene sixthScene = new Scene(rootSixth);
			showAllCategories.setTitle("Apricity");
			showAllCategories.setScene(sixthScene);
			
			showAllProducts = new Stage();
			URL seventh = getClass().getClassLoader().getResource("ShowAllProducts.fxml");
			Parent rootSeventh = FXMLLoader.load(seventh);
			Scene seventhScene = new Scene(rootSeventh);
			showAllProducts.setTitle("Apricity");
			showAllProducts.setScene(seventhScene);
			
			searchAProduct = new Stage();
			URL eighth = getClass().getClassLoader().getResource("SearchAProduct.fxml");
			Parent rootEighth = FXMLLoader.load(eighth);
			Scene eighthScene = new Scene(rootEighth);
			searchAProduct.setTitle("Apricity");
			searchAProduct.setScene(eighthScene);
			
			changeUserPassword = new Stage();
			URL nineth = getClass().getClassLoader().getResource("ChangeUserPassword.fxml");
			Parent rootNineth = FXMLLoader.load(nineth);
			Scene ninethScene = new Scene(rootNineth);
			changeUserPassword.setTitle("Apricity");
			changeUserPassword.setScene(ninethScene);
			
			changeUserEmail = new Stage();
			URL tenth = getClass().getClassLoader().getResource("ChangeUserEmail.fxml");
			Parent rootTenth = FXMLLoader.load(tenth);
			Scene tenthScene = new Scene(rootTenth);
			changeUserEmail.setTitle("Apricity");
			changeUserEmail.setScene(tenthScene);
			
			adminMenu = new Stage();
			URL eleventh = getClass().getClassLoader().getResource("AdminMenu.fxml");
			Parent rootEleventh = FXMLLoader.load(eleventh);
			Scene eleventhScene = new Scene(rootEleventh);
			adminMenu.setTitle("Apricity");
			adminMenu.setScene(eleventhScene);
			
			increaseProductStock = new Stage();
			URL twelfth = getClass().getClassLoader().getResource("IncreaseProductStock.fxml");
			Parent rootTwelfth = FXMLLoader.load(twelfth);
			Scene twelfthScene = new Scene(rootTwelfth);
			increaseProductStock.setTitle("Apricity");
			increaseProductStock.setScene(twelfthScene);
			
			changeAdminPassword = new Stage();
			URL thirteenth = getClass().getClassLoader().getResource("ChangeAdminPassword.fxml");
			Parent rootThirteenth = FXMLLoader.load(thirteenth);
			Scene thirteenthScene = new Scene(rootThirteenth);
			changeAdminPassword.setTitle("Apricity");
			changeAdminPassword.setScene(thirteenthScene);
			
			changeUserName = new Stage();
			URL fourteenth = getClass().getClassLoader().getResource("ChangeUserName.fxml");
			Parent rootFourteenth = FXMLLoader.load(fourteenth);
			Scene fourteenthScene = new Scene(rootFourteenth);
			changeUserName.setTitle("Apricity");
			changeUserName.setScene(fourteenthScene);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Inicio() {
		launch(null);
	}
}
