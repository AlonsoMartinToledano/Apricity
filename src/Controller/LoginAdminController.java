package Controller;

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
    }

    @FXML
    void pushLoginButton(ActionEvent event) {
    	General.loginAdmin.close();
    	General.adminMenu.show();
    }

    @FXML
    void writePasswordText(ActionEvent event) {

    }

}
