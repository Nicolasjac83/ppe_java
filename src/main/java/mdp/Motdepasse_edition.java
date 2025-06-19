package mdp;

import com.example.hsp_java.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Motdepasse_edition {

    @FXML
    private TextField confirmer;

    @FXML
    private TextField mdp;

    @FXML
    void OnRetourAction(ActionEvent event) {
        HelloApplication.changeScene("/inscription/inscription.fxml");
    }

    @FXML
    void OnSauvegarderAction(ActionEvent event) {
        HelloApplication.changeScene("/inscription/inscription.fxml");
    }

}
