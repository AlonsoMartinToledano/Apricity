package Controller;

import Class.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ShowAllCategoriesController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea allCategoriesText;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.showAllCategories.close();
    	General.normalUserMenu.show();
    	allCategoriesText.clear();
    }
    
    @FXML
    void viewAllCategoriesText(KeyEvent event) {
    	allCategoriesText.setText(Category.visualizeCategories());
    }

}
