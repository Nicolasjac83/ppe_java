package fournisseur;

import java.util.HashMap;
import java.util.Map;

public class FournisseurProduit {
    private Map<String, Map<String, Double>> fournisseurs; // Map de fournisseurs avec leurs produits et prix

    public FournisseurProduit() {
        this.fournisseurs = new HashMap<>();
    }

    // Ajouter un produit avec son prix pour un fournisseur donné
    public void ajouterProduitPourFournisseur(String fournisseur, String produit, Double prix) {
        if (fournisseurs.containsKey(fournisseur)) {
            fournisseurs.get(fournisseur).put(produit, prix);
        } else {
            System.out.println("Fournisseur inexistant !");
        }
    }

    // Obtenir le prix d'un produit pour un fournisseur donné
    public Double getPrixProduitPourFournisseur(String fournisseur, String produit) {
        if (fournisseurs.containsKey(fournisseur)) {
            Map<String, Double> produitsPrix = fournisseurs.get(fournisseur);
            if (produitsPrix.containsKey(produit)) {
                return produitsPrix.get(produit);
            } else {
                System.out.println("Produit inexistant pour ce fournisseur !");
                return null;
            }
        } else {
            System.out.println("Fournisseur inexistant !");
            return null;
        }
    }

    // Obtenir tous les produits d'un fournisseur avec leurs prix
    public Map<String, Double> getProduitsPrixPourFournisseur(String fournisseur) {
        if (fournisseurs.containsKey(fournisseur)) {
            return fournisseurs.get(fournisseur);
        } else {
            System.out.println("Fournisseur inexistant !");
            return null;
        }
    }
}
