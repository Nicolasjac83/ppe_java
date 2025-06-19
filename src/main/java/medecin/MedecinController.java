package medecin;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

public class MedecinController {

    @FXML
    private ComboBox<String> specialityComboBox;

    @FXML
    private ComboBox<String> doctorComboBox;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableView<Availability> availabilityTable;

    @FXML
    private void searchAvailability() {
        // Implémentez la logique de recherche des disponibilités en fonction des filtres sélectionnés
        // Vous pouvez interroger une base de données ou utiliser des données simulées pour remplir la table des disponibilités
    }
}
