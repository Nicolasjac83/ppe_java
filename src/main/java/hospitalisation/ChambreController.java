package hospitalisation;

import hospitalisation.Chambre;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class ChambreController {

    @FXML
    private Label chambre;

    @FXML
    private TableView<Chambre> menu_chambre; // Assurez-vous de définir le type correct de l'objet TableView

    @FXML
    private Button validerChambre;

    // Méthode appelée lors du clic sur le bouton "Valider Chambre"
    @FXML
    void OnValiderChambre(ActionEvent event) {
        // Récupérer les données saisies dans le tableau
        ObservableList<Chambre> chambreList = menu_chambre.getItems();

        // Parcourir la liste des chambres
        for (Chambre chambre : chambreList) {
            System.out.println("Numéro de chambre : " + chambre.getNumero()); // Exemple : Affichage du numéro de chambre
            System.out.println("Type de chambre : " + chambre.getType()); // Exemple : Affichage du type de chambre
            // Vous pouvez récupérer d'autres propriétés de la chambre de la même manière
        }
    }
}