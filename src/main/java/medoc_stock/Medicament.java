package medoc_stock;

import java.util.List;

public class Medicament {
    private String nom;
    private int quantiteEnStock;
    private String niveauDangerosite;
    private int nombrePatients;

    public Medicament(String nom, int quantite, String dangerosite, int i) {
    }

    // Constructeur, getters, setters
}
class StockManager {
    private List<Medicament> stock;

    public void ajouterMedicament(Medicament medicament) {
        // Logique d'ajout
    }

    public void modifierMedicament(Medicament medicament) {
        // Logique de modification
    }

    public void supprimerMedicament(Medicament medicament) {
        // Logique de suppression
    }

    public void commanderStock() {
        // Logique de commande
    }

}

