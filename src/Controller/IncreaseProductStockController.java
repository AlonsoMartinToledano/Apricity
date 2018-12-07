package Controller;

import Class.Product;
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
    	productText.clear();
    	unitsText.clear();
    }

    @FXML
    void pushIncreaseButton(ActionEvent event) {
    	Product.increaseProductStockVisual(productText.getText(), Integer.parseInt(unitsText.getText()));
    	productText.clear();
    	unitsText.clear();
    }

}
