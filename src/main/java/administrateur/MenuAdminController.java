package administrateur;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

import java.awt.desktop.UserSessionEvent;

public class MenuAdminController {

    @FXML
    private Pane pane;

    @FXML
    private Label menu_administrateur;

    @FXML
    private TableView<UserSessionEvent> tableau_administrateur;

    @FXML
    private TableColumn<Utilisateur, Integer> id_user;

    @FXML
    private TableColumn<Utilisateur, String> nom;

    @FXML
    private TableColumn<Utilisateur, String> prenom;

    @FXML
    private TableColumn<Utilisateur, String> emails;

    @FXML
    private TableColumn<Utilisateur, String> actions;

    @FXML
    private Button validerButton;

    @FXML
    private Button retourButton;

    // Ajoutez un constructeur par défaut
    public MenuAdminController() {
    }

    public void initialize() {
        // Initialize your TableView, load data, set cell factories, etc.
        // You can set cell value factories for each TableColumn here.
    }

    @FXML
    private void OnValiderAction() {
        // Handle the action when the Valider button is clicked
    }

    @FXML
    private void OnRetourAction() {
        // Handle the action when the Retour button is clicked
    }
}
