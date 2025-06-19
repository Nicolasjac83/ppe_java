package inscription;

import inscription.Inscription;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class InscriptionController extends Application {

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private TextField email;

    @FXML
    private PasswordField mdp;

    @FXML
    void creerUnCompte(ActionEvent event) {
        String nomUtilisateur = nom.getText();
        String prenomUtilisateur = prenom.getText();
        String emailUtilisateur = email.getText();
        String mdpUtilisateur = mdp.getText();

        boolean succes = Inscription.ajouterUtilisateur(nomUtilisateur, prenomUtilisateur, emailUtilisateur, mdpUtilisateur);

        if (succes) {
            System.out.println("Utilisateur ajouté avec succès !");
        } else {
            System.out.println("Une erreur est survenue lors de l'ajout de l'utilisateur.");
        }
    }

    @FXML
    void OnRetourAction(ActionEvent event) {

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Charger le fichier FXML
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("inscription.fxml")));

        // Créer la scène
        Scene scene = new Scene(root);

        // Afficher la scène
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
