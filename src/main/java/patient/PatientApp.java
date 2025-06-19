package patient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PatientApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Chargement du fichier FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Patient.fxml"));
        Parent root = loader.load();

        // Obtention du contrôleur
        PatientController controller = loader.getController();

        // Configuration de la scène
        Scene scene = new Scene(root);

        // Configuration de la scène principale
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gestion des Patients");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
