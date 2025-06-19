package connexion;

import com.example.hsp_java.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Connexion {

    @FXML
    private TextField email;

    @FXML
    private PasswordField mdp;

    public void seConnecterAction(javafx.event.ActionEvent actionEvent) {
        HelloApplication.changeScene("/com/example/hsp_java/CRUDUser.fxml");
    }
}
