public abstract class Ustensile {
    private int dateDeFabrication;

    public Ustensile(int dateDeFabrication) {
        this.dateDeFabrication = dateDeFabrication;
    }

    public Ustensile() {
    }

    public int getDateDeFabrication() {
        return dateDeFabrication;
    }

    public void setDateDeFabrication(int dateDeFabrication) {
        this.dateDeFabrication = dateDeFabrication;
    }
    public void affcheDateDeFabrication(){
        System.out.println("le date de fabrication est :"+dateDeFabrication);
    }

    public abstract int calculerValeur(int annee);
}
