package medoc_stock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GestionStockApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger le fichier FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GestionStock.fxml"));
        Parent root = loader.load();

        // Associer le contrôleur JavaFX au fichier FXML
        StockController controller = loader.getController();

        // Créer la scène
        Scene scene = new Scene(root);

        // Définir la scène principale
        primaryStage.setScene(scene);
        primaryStage.setTitle("Application de gestion de stock de médicaments");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}