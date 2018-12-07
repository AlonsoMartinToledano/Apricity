package Controller;

import Class.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ChangeUserNameController {

    @FXML
    private TextField newUserNameText;

    @FXML
    private Button changeButton;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.changeUserName.close();
    	General.adminMenu.show();
    	newUserNameText.clear();
    }

    @FXML
    void pushChangeButton(ActionEvent event) {
    	User.setUserName(newUserNameText.getText());
    	newUserNameText.clear();
    }

}
