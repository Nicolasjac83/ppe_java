package mdp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Motdepasse_oublieApp extends Application {
    @Override
        public void start(Stage primaryStage) throws Exception {
            // Charge le fichier FXML
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Mot_de_passe oublié.fxml")));

            // Crée une nouvelle scène
            Scene scene = new Scene(root);

            // Configure la scène et affiche la fenêtre
            primaryStage.setTitle("Mot de Passe Oublié");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
