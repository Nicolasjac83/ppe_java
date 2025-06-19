package patient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DossierPatientController {

    @FXML
    private TextField idDossierField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextArea symptomesArea;

    @FXML
    private Slider graviteSlider;

    @FXML
    private TextField refSecretaireField;

    @FXML
    private void enregistrerDossier() {
        // Implémentez la logique pour enregistrer le dossier patient
        String idDossier = idDossierField.getText();
        String date = datePicker.getValue().toString();
        String symptomes = symptomesArea.getText();
        double niveauGravite = graviteSlider.getValue();
        String refSecretaire = refSecretaireField.getText();
    }

    public void OnAnnuler(ActionEvent actionEvent) {
    }
}

