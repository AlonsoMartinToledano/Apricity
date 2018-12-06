package Controller;

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
    }

    @FXML
    void pushSearchButton(ActionEvent event) {

    }

    @FXML
    void writeSearchText(ActionEvent event) {

    }

}
