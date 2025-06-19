package hospitalisation;

public class Hospitalisation {
    private Chambre chambre;

    public Hospitalisation(Chambre chambre, String descriptionMaladie) {
        this.chambre = chambre;
        chambre.setOccupee(true); // Marquer la chambre comme occupée
    }

    public void libererChambre() {
        chambre.setOccupee(false); // Libérer la chambre une fois que le patient est sorti
    }
}
