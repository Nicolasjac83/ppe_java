package mdp;

import com.example.hsp_java.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Motdepasse_oublie {

    @FXML
    private TextField email;

    @FXML
    private PasswordField mdp;

    @FXML
    void OnCodeAction(ActionEvent event) {

    }

    @FXML
    void OnVerificationAction(ActionEvent event) {

    }

    @FXML
    void OnRetourAction(ActionEvent event) {
        HelloApplication.changeScene("/connexion/connexion.fxml");

    }

}