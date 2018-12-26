package Controller;

import Class.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SearchAProductController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea productText;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchText;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.searchAProduct.close();
    	General.normalUserMenu.show();
    	searchText.clear();
    	productText.clear();
    }

    @FXML
    void pushSearchButton(ActionEvent event) {
    	if (Category.Product.productExist(searchText.getText())) {
    		productText.setText(Category.Product.visualizeAProduct(searchText.getText()));
    		searchText.clear();
    	}
    	else {
    		searchText.clear();
    		productText.setText("The product does not exist in our database");
    	}
    }

}
