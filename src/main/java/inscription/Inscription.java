package inscription;

import com.example.hsp_java.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inscription {

    @FXML
    private TextField email;

    @FXML
    private PasswordField mdp;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    void CreerUnCompte(ActionEvent event) {
        HelloApplication.changeScene("/inscription/inscription.fxml");
    }

    @FXML
    public void OnRetourAction(ActionEvent actionEvent) {
        HelloApplication.changeScene("/connexion/connexion.fxml");
    }


    private static Connection connexion;

    private static void init() throws SQLException {
        if (connexion == null || connexion.isClosed()) {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/hsp_java", "root", "");
        }
    }

    public static boolean ajouterUtilisateur(String nom, String prenom, String email, String mdp) {
        boolean succes = false;

        try {
            init();
            PreparedStatement ps = connexion.prepareStatement(
                    "INSERT INTO users(nom, prenom, email, mdp) VALUES (?, ?, ?, ?)"
            );
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, email);
            ps.setString(4, mdp);
            int result = ps.executeUpdate();
            if (result > 0) {
                succes = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return succes;
    }
}