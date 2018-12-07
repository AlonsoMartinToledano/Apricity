package Controller;

import Class.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ShowAccountInformationController {

    @FXML
    private TextArea userNameText;

    @FXML
    private TextArea passwordText;

    @FXML
    private TextArea emailText;

    @FXML
    private Button backButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.showAccountInformation.close();
    	General.normalUserMenu.show();
    	userNameText.clear();
    	passwordText.clear();
    	emailText.clear();
    }
    
    @FXML
    void viewUserNameText(KeyEvent event) {
    	userNameText.setText(User.getUserName());
    	passwordText.setText(User.getUserPassword());
    	emailText.setText(User.getUserEmail());
    }
    
}
