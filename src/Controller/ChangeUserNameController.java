package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ChangeUserNameController {

    @FXML
    private PasswordField newUserNameText;

    @FXML
    private Button changeButton;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeUserName.close();
    	General.adminMenu.show();
    }

    @FXML
    void pushChangeButton(ActionEvent event) {

    }

    @FXML
    void writeNewUserNameText(ActionEvent event) {

    }

}
