package patient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PatientController {

    public Label fiche_patient;
    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private TextField numSecuField;

    @FXML
    private TextField mutuelleField;

    @FXML
    private void enregistrerPatient() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String numSecu = numSecuField.getText();
        String mutuelle = mutuelleField.getText();

        // Vous pouvez traiter les données ici, telles que les valider, les enregistrer dans une base de données, etc.
        // Par exemple, affichez-les pour l'instant
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Numéro de Sécurité Sociale : " + numSecu);
        System.out.println("Mutuelle : " + mutuelle);
    }

    public void OnAnnuler(ActionEvent actionEvent) {
    }
}
