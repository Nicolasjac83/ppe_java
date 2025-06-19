package hospitalisation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HospitalisationController {

    @FXML
    private TextField datePriseEnChargeField;

    @FXML
    private TextArea descriptionMaladieArea;

    @FXML
    private Label statusLabel;

    @FXML
    void ajouterHospitalisation(ActionEvent event) {
        // Logique pour ajouter une hospitalisation
        String datePriseEnCharge = datePriseEnChargeField.getText();
        String descriptionMaladie = descriptionMaladieArea.getText();

        // Code pour ajouter l'hospitalisation dans le système

        // Afficher un message de confirmation
        statusLabel.setText("Nouvelle hospitalisation ajoutée !");
    }

    @FXML
    void faireDemandeProduit(ActionEvent event) {
        // Logique pour faire une demande de produit
        // Récupérer les informations saisies par le médecin

        // Afficher un message de confirmation
        statusLabel.setText("Demande de produit soumise !");
    }
}

