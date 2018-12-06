package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

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
    }

}
