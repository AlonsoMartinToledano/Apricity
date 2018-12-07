package Controller;

import Class.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ChangeUserPasswordController {

    @FXML
    private Button changeButton;

    @FXML
    private PasswordField newPasswordText1;

    @FXML
    private PasswordField newPasswordText2;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeUserPassword.close();
    	General.normalUserMenu.show();
    	newPasswordText1.clear();
    	newPasswordText2.clear();
    }

    @FXML
    void pushNewPasswordButton(ActionEvent event) {
    	if (newPasswordText1.getText().equals(newPasswordText2.getText())) {
    		User.setUserPassword(newPasswordText1.getText());
    		newPasswordText1.clear();
        	newPasswordText2.clear();
    	}
    }

}
