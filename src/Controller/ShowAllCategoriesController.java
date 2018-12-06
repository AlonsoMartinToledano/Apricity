package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ShowAllCategoriesController {

    @FXML
    private Button backButton;

    @FXML
    private TextArea allCategoriesText;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.showAllCategories.close();
    	General.normalUserMenu.show();
    }

}
