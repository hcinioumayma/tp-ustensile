public class Cuillere extends Ustensile{
    private double longueur;
    public Cuillere(int dateDeFabrication) {
        super(dateDeFabrication);
    }

    public Cuillere(int dateDeFabrication, double longueur) {
        super(dateDeFabrication);
        this.longueur = longueur;
    }

    public Cuillere(double longueur) {
        this.longueur = longueur;
    }

    public Cuillere() {
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    @Override
    public int calculerValeur(int annee) {
        if(annee-getDateDeFabrication()>=50){
            return annee-getDateDeFabrication()-50;
        }
        else return 0;
    }
}
