package fournisseur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FournisseurProduitApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Charger le fichier FXML du contrôleur FournisseurProduitController
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FournisseurProduit.fxml"));
        Parent root = loader.load();

        // Obtenir le contrôleur
        FournisseurProduitController controller = loader.getController();

        // Créer une instance de FournisseurProduit
        FournisseurProduit fournisseurProduit = new FournisseurProduit();

        // Injecter l'instance de FournisseurProduit dans le contrôleur
        controller.setFournisseurProduit(fournisseurProduit);

        // Créer la scène
        Scene scene = new Scene(root);

        // Configurer la scène
        primaryStage.setScene(scene);
        primaryStage.setTitle("Application Fournisseur Produit");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}