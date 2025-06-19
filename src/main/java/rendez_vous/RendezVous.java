package rendez_vous;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

import java.time.LocalDateTime;

public class RendezVous {
    private final StringProperty identifiant;
    private final StringProperty nomPatient;
    private final StringProperty specialiteMedecin;
    private final StringProperty statut;
    private final LocalDateTime dateRendezVous;

    public RendezVous(String identifiant, String nomPatient, String specialiteMedecin, String statut, LocalDateTime dateRendezVous) {
        this.identifiant = new SimpleStringProperty(identifiant);
        this.nomPatient = new SimpleStringProperty(nomPatient);
        this.specialiteMedecin = new SimpleStringProperty(specialiteMedecin);
        this.statut = new SimpleStringProperty(statut);
        this.dateRendezVous = dateRendezVous;
    }

    public String getIdentifiant() {
        return identifiant.get();
    }

    public StringProperty identifiantProperty() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant.set(identifiant);
    }

    public String getNomPatient() {
        return nomPatient.get();
    }

    public StringProperty nomPatientProperty() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient.set(nomPatient);
    }

    public String getSpecialiteMedecin() {
        return specialiteMedecin.get();
    }

    public StringProperty specialiteMedecinProperty() {
        return specialiteMedecin;
    }

    public void setSpecialiteMedecin(String specialiteMedecin) {
        this.specialiteMedecin.set(specialiteMedecin);
    }

    public String getStatut() {
        return statut.get();
    }

    public StringProperty statutProperty() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut.set(statut);
    }

    public LocalDateTime getDateRendezVous() {
        return dateRendezVous;
    }

    public ObservableValue<String> getDateRendezVousProperty() {
        return new SimpleStringProperty(dateRendezVous.toString());
    }
}

