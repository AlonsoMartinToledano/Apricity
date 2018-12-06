package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ShowAllProductsController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea allProductsText;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.showAllProducts.close();
    	General.normalUserMenu.show();
    }

}
