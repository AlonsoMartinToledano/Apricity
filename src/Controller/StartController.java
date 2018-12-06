package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartController {

    @FXML
    private Button adminButton;

    @FXML
    private Button normalUserButton;

    @FXML
    private Button exitButton;

    @FXML
    void pushAdminButton(ActionEvent event) {
    	General.start.close();
    	General.loginAdmin.show();
    }

    @FXML
    void pushExitButton(ActionEvent event) {
    	General.start.close();
    }

    @FXML
    void pushNormalUserButton(ActionEvent event) {
    	General.start.close();
    	General.loginNormalUser.show();
    }

}
