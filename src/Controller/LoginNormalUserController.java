package Controller;

import Class.User;
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
    	userNameText.clear();
		passwordText.clear();
    }

    @FXML
    void pushLoginButton(ActionEvent event) {
    	String name = userNameText.getText();
    	String pass = passwordText.getText();
    	
    	if (User.loginNormalUser(name, pass)) {
    		General.loginNormalUser.close();
        	General.normalUserMenu.show();
        	userNameText.clear();
        	passwordText.clear();
    	}
    	else {
    		userNameText.clear();
    		passwordText.clear();
    	}
    }

}
