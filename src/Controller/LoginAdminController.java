package Controller;

import Class.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class LoginAdminController {

    @FXML
    private Button backButton;

    @FXML
    private PasswordField passwordText;

    @FXML
    private Button loginButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.loginAdmin.close();
    	General.start.show();
    	passwordText.clear();
    }

    @FXML
    void pushLoginButton(ActionEvent event) {
    	String pass = passwordText.getText();
    	
    	if (Admin.loginAdmin(pass)) {
    		General.loginAdmin.close();
        	General.adminMenu.show();
        	passwordText.clear();
    	}
    	else {
    		passwordText.clear();
    	}
    }

}
