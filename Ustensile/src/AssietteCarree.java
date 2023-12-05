public class AssietteCarree extends Assiette{
    private double cote;

    public AssietteCarree(int dateDeFabrication, double cote) {
        super(dateDeFabrication);
        this.cote = cote;
    }

    public AssietteCarree(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }
    @Override
    public int calculerValeur(int annee) {
        if(annee-getDateDeFabrication()>50){
            return( annee-getDateDeFabrication()-50)*5;
        }else return 0;

    }

    @Override
    public double calculerSurface() {
        return cote*cote;
    }
}
