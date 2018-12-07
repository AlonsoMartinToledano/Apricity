package Controller;

import Class.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ChangeUserEmailController {

    @FXML
    private Button backButton;

    @FXML
    private Button changeButton;

    @FXML
    private PasswordField newEmailText1;

    @FXML
    private PasswordField newEmailText2;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeUserEmail.close();
    	General.normalUserMenu.show();
    	newEmailText1.clear();
    	newEmailText2.clear();
    }

    @FXML
    void pushNewPasswordButton(ActionEvent event) {
    	if (newEmailText1.getText().equals(newEmailText2.getText())) {
    		User.setUserEmail(newEmailText1.getText());
    		newEmailText1.clear();
        	newEmailText2.clear();
    	}
    }

}
