package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ChangeUserEmailController {

    @FXML
    private PasswordField newEmailText;

    @FXML
    private Button changeButton;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeUserEmail.close();
    	General.normalUserMenu.show();
    }

    @FXML
    void pushChangeButton(ActionEvent event) {

    }

    @FXML
    void writeNewEmailText(ActionEvent event) {

    }

}
