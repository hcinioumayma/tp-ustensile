public class Collection {
    public static void afficherCuilleres(Ustensile ustensile[]){
        int nomberOfCuillere=0;
        for (int i = 0; i < ustensile.length; i++) {
            if (ustensile[i] instanceof Cuillere){
                nomberOfCuillere++;
            }
        }
        System.out.println("Le nomber d'objets de type cyillere est "+nomberOfCuillere);
    }
    public static double afficherSurfaceAssiettes(Ustensile ustensile[]){
        double surfacesToutales=0;
        for (int i = 0; i < ustensile.length; i++) {
            if(ustensile[i] instanceof Assiette){
                surfacesToutales +=((Assiette) ustensile[i]).calculerSurface();
            }
        }
        return surfacesToutales;
    }

    public static double afficherValeurTotale(Ustensile ustensile[]){
        double valeurTotale=0;
        for (int i = 0; i < ustensile.length; i++) {
            valeurTotale +=ustensile[i].calculerValeur(2023);
        }
        return valeurTotale;
    }
    public static void main(String[] args) {
        Ustensile[] ustensiles=new Ustensile[5];
        ustensiles[0]=new AssietteCarree(1954,5);
        ustensiles[1]=new AssietteCarree(1945,4);
        ustensiles[2]=new AssietteRonde(1922,10);
        ustensiles[3]=new Cuillere(1933,8);
        ustensiles[4]=new Cuillere(1921,7);
        afficherCuilleres(ustensiles);
        System.out.println("le surfaces de toutes les assiettes est :"+afficherSurfaceAssiettes(ustensiles));
        System.out.println("le valeurs de tous les usetensiles est :"+afficherValeurTotale(ustensiles));
    }
}
