package Controller;

import Class.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ShowAllProductsController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea allProductsText;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.showAllProducts.close();
    	General.normalUserMenu.show();
    	allProductsText.clear();
    }
    
    @FXML
    void viewAllProductsText(KeyEvent event) {
    	allProductsText.setText(Category.Product.visualizeProducts());
    }

}
