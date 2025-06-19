package administrateur;

import java.util.HashMap;
import java.util.Map;

public class Administrateur {
    private String nom;
    private String prenom;
    private String identifiant;
    private String motDePasse;
    private Map<String, Utilisateur> utilisateurs; // Une structure pour stocker les utilisateurs

    // Constructeur
    public Administrateur(String nom, String prenom, String identifiant, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
        this.utilisateurs = new HashMap<>(); // Initialiser la structure de stockage des utilisateurs
    }

    // Méthode d'authentification des utilisateurs
    public boolean authentifierUtilisateur(String identifiant, String motDePasse) {
        Utilisateur utilisateur = utilisateurs.get(identifiant);
        return utilisateur != null && utilisateur.estIdentifiantValide(identifiant, motDePasse);
    }

    // Méthode de récupération d'utilisateur
    public Utilisateur getUtilisateur(String identifiant) {
        return utilisateurs.get(identifiant);
    }

    // Méthode de création d'utilisateur
    public void creerUtilisateur(String nom, String prenom, String identifiant, String motDePasse, String typeUtilisateur) {
        // Créer un nouvel utilisateur en fonction du type
        Utilisateur nouvelUtilisateur = null;
        switch (typeUtilisateur) {
            case "Patient":
                nouvelUtilisateur = new Patient(nom, prenom, identifiant, motDePasse);
                break;
            case "Medecin":
                nouvelUtilisateur = new Medecin(nom, prenom, identifiant, motDePasse);
                break;
            case "Secretaire":
                nouvelUtilisateur = new Secretaire(nom, prenom, identifiant, motDePasse);
                break;
            case "GestionStock":
                nouvelUtilisateur = new GestionStock(nom, prenom, identifiant, motDePasse);
                break;
            default:
                // Gérer d'autres types d'utilisateurs si nécessaire
                break;
        }
        if (nouvelUtilisateur != null) {
            utilisateurs.put(identifiant, nouvelUtilisateur); // Ajouter l'utilisateur à la liste
        }
    }

    // Méthode de suppression d'utilisateur
    public void supprimerUtilisateur(String identifiant) {
        utilisateurs.remove(identifiant); // Supprimer l'utilisateur de la liste
    }

    // Getters et setters pour les autres attributs

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

}
