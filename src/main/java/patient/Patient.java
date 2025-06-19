package patient;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class Patient {
    private StringProperty nom;
    private StringProperty prenom;
    private StringProperty numSecu;
    private StringProperty mutuelle;

    public Patient(String nom, String prenom, String numSecu, String mutuelle) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.numSecu = new SimpleStringProperty(numSecu);
        this.mutuelle = new SimpleStringProperty(mutuelle);
    }

    public Patient(String text, String text1, int i, String text2, String text3) {
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public String getNumSecu() {
        return numSecu.get();
    }

    public void setNumSecu(String numSecu) {
        this.numSecu.set(numSecu);
    }

    public StringProperty numSecuProperty() {
        return numSecu;
    }

    public String getMutuelle() {
        return mutuelle.get();
    }

    public void setMutuelle(String mutuelle) {
        this.mutuelle.set(mutuelle);
    }

    public StringProperty mutuelleProperty() {
        return mutuelle;
    }

    public ObservableValue<String> getNomProperty() {
        return nom;
    }

    public ObservableValue<String> getPrenomProperty() {
        return prenom;
    }

    public BooleanExpression getAgeProperty() {
        // Cette méthode est basée sur des expressions conditionnelles
        // Vous devrez implémenter la logique pour obtenir l'âge du patient
        return null;
    }

    public ObservableValue<String> getRefPatientProperty() {
        // Vous pouvez utiliser une SimpleStringProperty pour la référence du patient
        return null;
    }

    public ObservableValue<String> getDossierPatientProperty() {
        // Vous pouvez utiliser une SimpleStringProperty pour le dossier du patient
        return null;
    }
}
