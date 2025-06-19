package connexion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnexionController {

    @FXML
    private TextField email;

    @FXML
    private PasswordField mdp;

    @FXML
    public void initialize() {
        // Vous ne devriez pas réinitialiser les champs email et mdp ici
        // C'est déjà pris en charge par FXMLLoader
    }

    public void afficher() throws IOException {
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("connexion.fxml"));
        Parent root = loader.load();
        ConnexionController controller = loader.getController();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    public void OnSeConnecterAction(ActionEvent actionEvent) throws IOException {
        // Code pour se connecter
        System.out.println("Action Se connecter");

        // Ajoutez ici le code pour afficher la vue principale après la connexion
        Stage primaryStage = (Stage) email.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/hsp_java/mainview.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    public void OnMotDePasseOublie(ActionEvent actionEvent) throws IOException {
        // Code pour réinitialiser le mot de passe
        System.out.println("Action Mot de passe oublié");

        // Ajoutez ici le code pour afficher la vue principale après la connexion
        Stage primaryStage = (Stage) email.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/mdp/Mot_de_passe oublié.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    public void OnInscriptionAction(ActionEvent actionEvent) throws IOException {
        // Code pour réinitialiser le mot de passe
        System.out.println("Action inscription");

        // Ajoutez ici le code pour afficher la vue principale après la connexion
        Stage primaryStage = (Stage) email.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/inscription/inscription.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
