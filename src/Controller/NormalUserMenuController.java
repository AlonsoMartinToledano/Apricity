package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class NormalUserMenuController {

    @FXML
    private Button backButton;

    @FXML
    private Button showAccountInformationButton;

    @FXML
    private Button showAllCategoriesButton;

    @FXML
    private Button showAllProductsButton;

    @FXML
    private Button searchAProductButton;

    @FXML
    private MenuItem changePasswordButton;

    @FXML
    private MenuItem changeEmail;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.start.show();
    }

    @FXML
    void pushChangeEmail(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.changeUserEmail.show();
    }

    @FXML
    void pushChangePasswordButton(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.changeUserPassword.show();
    }

    @FXML
    void pushSearchAProduct(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.searchAProduct.show();
    }

    @FXML
    void pushShowAccountInformationButton(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.showAccountInformation.show();
    }

    @FXML
    void pushShowAllCategoriesButton(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.showAllCategories.show();
    }

    @FXML
    void pushShowAllProductsButton(ActionEvent event) {
    	General.normalUserMenu.close();
    	General.showAllProducts.show();
    }

}
