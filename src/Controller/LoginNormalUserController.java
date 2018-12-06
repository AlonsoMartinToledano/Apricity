package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginNormalUserController {

    @FXML
    private TextField userNameText;

    @FXML
    private PasswordField passwordText;

    @FXML
    private Button loginButton;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.loginNormalUser.close();
    	General.start.show();
    }

    @FXML
    void pushLoginButton(ActionEvent event) {
    	if(userNameText.getText() == "a") {
    		General.loginNormalUser.close();
    	}
    	else {
    		System.out.print(userNameText.getText());
    	}
    }

    @FXML
    void writePassword(ActionEvent event) {
    	
    }

    @FXML
    void writeUserName(ActionEvent event) {
    	
    }
}
