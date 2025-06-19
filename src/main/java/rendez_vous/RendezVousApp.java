package rendez_vous;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RendezVousApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Chargement du fichier FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RendezVous.fxml"));
        Parent root = loader.load();

        // Obtention du contrôleur
        RendezVousController controller = loader.getController();

        // Configuration de la scène
        Scene scene = new Scene(root);

        // Configuration de la scène principale
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gestion des Rendez-vous");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

