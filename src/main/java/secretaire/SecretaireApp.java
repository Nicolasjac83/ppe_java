package secretaire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecretaireApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charge le fichier FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_secretaire_format_tableau.fxml"));
        Parent root = loader.load();

        // Récupère le contrôleur après le chargement du FXML
        SecretaireController controller = loader.getController();

        // Configurez les cellules des colonnes de la TableView
        controller.initialize();

        // Crée une nouvelle scène
        Scene scene = new Scene(root);

        // Configure la scène et affiche la fenêtre
        primaryStage.setTitle("Application de la Secrétaire");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
