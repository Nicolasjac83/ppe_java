package hospitalisation;

public class Chambre {
    private boolean occupee;

    public Chambre() {
        this.occupee = false; // Au départ, la chambre est libre
    }

    public boolean estOccupee() {
        return occupee;
    }

    public void setOccupee(boolean occupee) {
        this.occupee = occupee;
    }

    public String getNumero() {
        return null;
    }

    public String getType() {
        return null;
    }
}