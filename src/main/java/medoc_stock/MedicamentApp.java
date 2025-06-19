package medoc_stock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MedicamentApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Charger le fichier FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StockMedoc.fxml"));
        Parent root = loader.load();

        // Obtenir le contrôleur associé au FXML
        MedicamentController controller = loader.getController();
        controller.setStockManager(new StockManager()); // Initialiser le gestionnaire de stock

        // Configurer la scène
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gestion de stock de médicaments");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

