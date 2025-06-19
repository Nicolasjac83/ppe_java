package patient;

import java.time.LocalDate;

public class DossierPatient {
    private int idDossierPatient;
    private LocalDate date;
    private String descSymptomes;
    private int niveauGravite;
    private String refSecretaire;

    // Constructeur
    public DossierPatient(int idDossierPatient, LocalDate date, String descSymptomes, int niveauGravite, String refSecretaire) {
        this.idDossierPatient = idDossierPatient;
        this.date = date;
        this.descSymptomes = descSymptomes;
        this.niveauGravite = niveauGravite;
        this.refSecretaire = refSecretaire;
    }

    // Getters et Setters
    public int getIdDossierPatient() {
        return idDossierPatient;
    }

    public void setIdDossierPatient(int idDossierPatient) {
        this.idDossierPatient = idDossierPatient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescSymptomes() {
        return descSymptomes;
    }

    public void setDescSymptomes(String descSymptomes) {
        this.descSymptomes = descSymptomes;
    }

    public int getNiveauGravite() {
        return niveauGravite;
    }

    public void setNiveauGravite(int niveauGravite) {
        this.niveauGravite = niveauGravite;
    }

    public String getRefSecretaire() {
        return refSecretaire;
    }

    public void setRefSecretaire(String refSecretaire) {
        this.refSecretaire = refSecretaire;
    }
}
