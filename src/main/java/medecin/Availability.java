package medecin;

import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.time.LocalTime;

public class Availability {
    private String nomMedecin;
    private String specialite;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public Availability(String nomMedecin, String specialite, LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
        this.nomMedecin = nomMedecin;
        this.specialite = specialite;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

}