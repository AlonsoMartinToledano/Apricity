package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class IncreaseProductStockController {

    @FXML
    private Button backButton;

    @FXML
    private TextField productText;

    @FXML
    private TextField unitsText;

    @FXML
    private Button increaseButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.increaseProductStock.close();
    	General.adminMenu.show();
    }

    @FXML
    void pushIncreaseButton(ActionEvent event) {

    }

    @FXML
    void writeProductText(ActionEvent event) {

    }

    @FXML
    void writeUnitsText(ActionEvent event) {

    }

}
