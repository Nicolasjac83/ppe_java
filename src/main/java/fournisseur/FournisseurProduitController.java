package fournisseur;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class FournisseurProduitController {
    private FournisseurProduit fournisseurProduit; // Modèle des données

    @FXML
    private ListView<String> listeFournisseurs;

    @FXML
    private ListView<String> listeProduitsFournisseur;

    @FXML
    private TextField champPrixProduit;

    @FXML
    void onAjouterPrix(ActionEvent event) {
        String fournisseur = listeFournisseurs.getSelectionModel().getSelectedItem();
        String produit = listeProduitsFournisseur.getSelectionModel().getSelectedItem();
        Double prix = Double.parseDouble(champPrixProduit.getText());

        if (fournisseur != null && produit != null) {
            fournisseurProduit.ajouterProduitPourFournisseur(fournisseur, produit, prix);
        }
    }

    public void setFournisseurProduit(FournisseurProduit fournisseurProduit) {
        this.fournisseurProduit = fournisseurProduit;
    }

    // Méthode pour mettre à jour la liste des fournisseurs
    public void updateFournisseursList(String fournisseur) {
        ObservableList<String> items = listeFournisseurs.getItems();
        items.add(fournisseur);
    }

    public void OnAjouterPrix(ActionEvent actionEvent) {
    }

    // Autres méthodes pour initialiser la liste des fournisseurs, des produits, etc.
}
