package Controller;

import Class.Admin;
import Class.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ChangeAdminPasswordController {

    @FXML
    private Button backButton;

    @FXML
    private Button changeButton;

    @FXML
    private PasswordField newPasswordText1;

    @FXML
    private PasswordField newPasswordText2;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeAdminPassword.close();
    	General.adminMenu.show();
    	newPasswordText1.clear();
    	newPasswordText2.clear();
    }

    @FXML
    void pushNewPasswordButton(ActionEvent event) {
    	if (newPasswordText1.getText().equals(newPasswordText2)) {
    		Admin.setAdminPassword(newPasswordText1.getText());
    		newPasswordText1.clear();
    		newPasswordText2.clear();
    	}
    }

}