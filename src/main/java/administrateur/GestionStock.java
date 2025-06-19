package administrateur;

// Classe GestionStock dans un autre package, implémentant Utilisateur
public class GestionStock implements Utilisateur {
    public GestionStock(String nom, String prenom, String identifiant, String motDePasse) {
    }

    // Implémentez les méthodes de l'interface Utilisateur
    @Override
    public void methodeCommune() {
        // Implémentation spécifique pour GestionStock
    }

    @Override
    public boolean estIdentifiantValide(String identifiant, String motDePasse) {
        return false;
    }

    @Override
    public void mettreAJourMotDePasse(String nouveauMotDePasse) {

    }

    @Override
    public String getNomComplet() {
        return null;
    }

    @Override
    public void deconnecter() {

    }
}
