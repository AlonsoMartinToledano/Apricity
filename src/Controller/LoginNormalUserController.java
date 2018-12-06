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
    	General.loginNormalUser.close();
    	General.normalUserMenu.show();
    }

    @FXML
    void writePassword(ActionEvent event) {
    	
    }

    @FXML
    void writeUserName(ActionEvent event) {
    	
    }
}
