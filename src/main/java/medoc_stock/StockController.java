package medoc_stock;

import com.example.hsp_java.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StockController {

    @FXML
    private Button ajouterButton;

    @FXML
    private Label fournisseur;

    @FXML
    private TextField fournisseurField;

    @FXML
    private Label prix;

    @FXML
    private TextField prixField;

    @FXML
    private Label produit;

    @FXML
    private TextField produitField;

    @FXML
    private Label stock;

    @FXML
    void onAjouterClicked(ActionEvent event) {
        String fournisseurText = fournisseurField.getText();
        String produitText = produitField.getText();
        double prixValue = Double.parseDouble(prixField.getText());

        // Effectuer des opérations de gestion de stock avec les données saisies
        // Par exemple, vous pouvez appeler des méthodes pour ajouter un produit, mettre à jour le stock, etc.

        // Afficher un message de confirmation dans le label
        stock.setText("Produit ajouté avec succès !");
    }

    public void OnAjouter(ActionEvent actionEvent) {
        HelloApplication.changeScene("/medoc_stock/GestionStock.fxml");
    }
}