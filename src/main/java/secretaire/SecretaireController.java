package secretaire;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import patient.Patient;

public class SecretaireController {

    @FXML
    private TableView<Patient> tableau_secretaire;

    @FXML
    private TableColumn<Patient, String> nomColumn;

    @FXML
    private TableColumn<Patient, String> prenomColumn;

    @FXML
    private TableColumn<Patient, String> ageColumn;

    @FXML
    private TableColumn<Patient, String> refPatientColumn;

    @FXML
    private TableColumn<Patient, String> dossierPatientColumn;

    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField refPatientField;

    @FXML
    private TextField dossierPatientField;

    @FXML
    private Button validerButton;

    @FXML
    public void initialize() {
        // Configurez les cellules des colonnes de la TableView
        nomColumn.setCellValueFactory(cellData -> cellData.getValue().getNomProperty());
        prenomColumn.setCellValueFactory(cellData -> cellData.getValue().getPrenomProperty());
        ageColumn.setCellValueFactory(cellData -> cellData.getValue().getAgeProperty().asString());
        refPatientColumn.setCellValueFactory(cellData -> cellData.getValue().getRefPatientProperty());
        dossierPatientColumn.setCellValueFactory(cellData -> cellData.getValue().getDossierPatientProperty());
    }

    @FXML
    private void OnValidation() {
        // Méthode appelée lorsque le bouton "Valider" est cliqué
        // Vous pouvez implémenter ici la logique de validation
        // par exemple, ajouter une nouvelle entrée à la TableView

        try {
            int age = Integer.parseInt(ageField.getText());
            Patient nouveauPatient = new Patient(
                    nomField.getText(),
                    prenomField.getText(),
                    age,
                    refPatientField.getText(),
                    dossierPatientField.getText()
            );
            tableau_secretaire.getItems().add(nouveauPatient);

            // Effacez les champs après validation
            nomField.clear();
            prenomField.clear();
            ageField.clear();
            refPatientField.clear();
            dossierPatientField.clear();
        } catch (NumberFormatException e) {
            // Gestion de l'erreur si l'âge n'est pas un nombre valide
            // Vous pouvez afficher un message d'erreur à l'utilisateur ou prendre d'autres mesures nécessaires.
            e.printStackTrace();
        }
    }
}
