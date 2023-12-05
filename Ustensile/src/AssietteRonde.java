public class AssietteRonde extends Assiette{
    private double rayon;

    public AssietteRonde(int dateDeFabrication, double rayon) {
        super(dateDeFabrication);
        this.rayon = rayon;
    }

    public AssietteRonde(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public int calculerValeur(int annee) {
        if(annee-getDateDeFabrication()>=50){
            return annee-getDateDeFabrication()-50;
        }
        else return 0;
    }

    @Override
    public double calculerSurface() {
        return 3.14*rayon*rayon;
    }
}
