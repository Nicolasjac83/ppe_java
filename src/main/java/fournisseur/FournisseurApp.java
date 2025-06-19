package fournisseur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FournisseurApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Charger le fichier FXML du fournisseur
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fournisseur.fxml"));
        Parent root = loader.load();

        // Créer la scène
        Scene scene = new Scene(root);

        // Configurer la scène
        primaryStage.setScene(scene);
        primaryStage.setTitle("Application Fournisseur");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
