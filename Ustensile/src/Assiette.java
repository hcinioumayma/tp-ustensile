public abstract class Assiette extends Ustensile{
    public Assiette(int dateDeFabrication) {
        super(dateDeFabrication);
    }

    public Assiette() {
    }
    public abstract double calculerSurface();
}