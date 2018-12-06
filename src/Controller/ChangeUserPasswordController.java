package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ChangeUserPasswordController {

    @FXML
    private PasswordField newPasswordText;

    @FXML
    private Button changeButton;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeUserPassword.close();
    	General.normalUserMenu.show();
    }

    @FXML
    void pushNewPasswordButton(ActionEvent event) {

    }

    @FXML
    void writeNewPasswordText(ActionEvent event) {

    }

}
