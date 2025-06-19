package medoc_stock;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MedicamentController {
    private StockManager stockManager;

    @FXML
    private TextField nomMedicamentTextField;

    @FXML
    private TextField quantiteTextField;

    @FXML
    private TextField dangerositeTextField;

    // Autres champs FXML

    @FXML
    private void ajouterMedicament() {
        String nom = nomMedicamentTextField.getText();
        String quantiteStr = quantiteTextField.getText();
        String dangerosite = dangerositeTextField.getText();

        try {
            int quantite = Integer.parseInt(quantiteStr);
            Medicament medicament = new Medicament(nom, quantite, dangerosite, 0); // Créer un médicament avec 0 patients initialement
            stockManager.ajouterMedicament(medicament);

            // Réinitialiser les champs
            nomMedicamentTextField.clear();
            quantiteTextField.clear();
            dangerositeTextField.clear();

            afficherMessage("Médicament ajouté avec succès.");
        } catch (NumberFormatException e) {
            afficherMessageErreur("La quantité doit être un nombre entier.");
        }
    }

    @FXML
    private void modifierMedicament() {
        // Logique pour modifier un médicament
    }

    @FXML
    private void supprimerMedicament() {
        // Logique pour supprimer un médicament
    }

    @FXML
    private void commanderStock() {
        // Logique pour commander du stock
    }

    // Autres méthodes

    private void afficherMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void afficherMessageErreur(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void setStockManager(StockManager stockManager) {
    }
}