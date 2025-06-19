package fournisseur;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FournisseurController {

    @FXML
    private TextField champNomFournisseur;

    @FXML
    private ListView<String> listeFournisseurs; // Assurez-vous que cette ListView est correctement liée dans votre fichier FXML

    @FXML
    void onValider(ActionEvent event) throws IOException {
        String nomFournisseur = champNomFournisseur.getText();
        // Appel de la méthode pour ajouter un fournisseur
        ajouterFournisseur(nomFournisseur);

        // Appel de la méthode pour mettre à jour la liste des fournisseurs dans FournisseurProduitController
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FournisseurProduit.fxml"));
        Parent root = loader.load();
        FournisseurProduitController controller = loader.getController();
        controller.updateFournisseursList(nomFournisseur);
    }

    // Méthode pour ajouter un fournisseur à la liste
    private void ajouterFournisseur(String nomFournisseur) {
        if (nomFournisseur != null && !nomFournisseur.isEmpty()) {
            ObservableList<String> items = listeFournisseurs.getItems();
            items.add(nomFournisseur);
            champNomFournisseur.clear(); // Efface le champ après l'ajout du fournisseur
        }
    }

    public void onRetour(ActionEvent actionEvent) {
    }
}
