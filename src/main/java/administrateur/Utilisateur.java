package administrateur;

public interface Utilisateur {
    // Méthode commune à tous les utilisateurs
    void methodeCommune();

    // Vérifie si l'identifiant et le mot de passe correspondent à l'utilisateur
    boolean estIdentifiantValide(String identifiant, String motDePasse);

    // Met à jour le mot de passe de l'utilisateur
    void mettreAJourMotDePasse(String nouveauMotDePasse);

    // Récupère le nom complet de l'utilisateur
    String getNomComplet();

    // Déconnecte l'utilisateur du système
    void deconnecter();
}
