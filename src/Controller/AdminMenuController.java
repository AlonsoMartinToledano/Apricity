package Controller;

import Class.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class AdminMenuController {

    @FXML
    private Button backButton;

    @FXML
    private Button increaseProductStockButton;

    @FXML
    private MenuItem changeAdminPasswordButton;

    @FXML
    private MenuItem changeNormalUserNameButton;

    @FXML
    private MenuItem categoryListFileButton;

    @FXML
    private MenuItem productListFileButton;

    @FXML
    void pushBackButton(ActionEvent event) {
    	General.adminMenu.close();
    	General.start.show();
    }

    @FXML
    void pushCategoryListFileButton(ActionEvent event) {
    	Category.writeCategoriesFile();
    }

    @FXML
    void pushChangeAdminPasswordButton(ActionEvent event) {
    	General.adminMenu.close();
    	General.changeAdminPassword.show();
    }

    @FXML
    void pushChangeNormalUserNameButton(ActionEvent event) {
    	General.adminMenu.close();
    	General.changeUserName.show();
    }

    @FXML
    void pushIncreaseProductStockButton(ActionEvent event) {
    	General.adminMenu.close();
    	General.increaseProductStock.show();
    }

    @FXML
    void pushProductListFileButton(ActionEvent event) {
    	Category.Product.writeProductsFile();
    }

}
