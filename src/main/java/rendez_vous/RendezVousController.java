package rendez_vous;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RendezVousController {

    private TableView<RendezVous> tableView; // Retirez @FXML

    @FXML
    private TableColumn<RendezVous, String> identifiantColumn;

    @FXML
    private TableColumn<RendezVous, String> nomPatientColumn;

    @FXML
    private TableColumn<RendezVous, String> specialiteMedecinColumn;

    @FXML
    private TableColumn<RendezVous, String> statutColumn;

    @FXML
    private TableColumn<RendezVous, String> dateRendezVousColumn;
    private RendezVous listeRendezVous;

    // Méthode d'initialisation du contrôleur
    @FXML
    private void initialize() {
        // Créez une nouvelle instance de TableView
        tableView = new TableView<>();

        // Associez les colonnes de la TableView aux propriétés de la classe RendezVous
        identifiantColumn.setCellValueFactory(cellData -> cellData.getValue().identifiantProperty());
        nomPatientColumn.setCellValueFactory(cellData -> cellData.getValue().nomPatientProperty());
        specialiteMedecinColumn.setCellValueFactory(cellData -> cellData.getValue().specialiteMedecinProperty());
        statutColumn.setCellValueFactory(cellData -> cellData.getValue().statutProperty());
        dateRendezVousColumn.setCellValueFactory(cellData -> cellData.getValue().getDateRendezVousProperty());

        // Chargez les rendez-vous dans la TableView
        chargerRendezVous();
    }

    // Méthode pour charger les rendez-vous dans la TableView
    private void chargerRendezVous() {
        // Ici, vous pouvez ajouter la logique pour charger les rendez-vous depuis une source de données
        // Par exemple, une liste de rendez-vous stockée dans une classe de gestion des rendez-vous
        if (tableView != null && listeRendezVous != null) {
            tableView.getItems().addAll(listeRendezVous);
        }
    }
}



