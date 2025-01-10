public class Bouteille {

    private boolean ouvert;
    private float contenuml;
    private float contenupourcent;

    public Bouteille() {

    }

    public Bouteille(boolean ouvert, float contenuml, float contenupourcent) {
        this.ouvert = ouvert;
        this.contenuml = contenuml * (contenupourcent / 100);
        this.contenupourcent = contenupourcent;

    }

    public Bouteille(Bouteille bouteille1) {

    }

    public boolean ouvrir() {

        ouvert = true;
        return ouvert;
    }

    public boolean fermer() {
        ouvert = false;
        return ouvert;
    }

    public boolean remplirfull() {
        if (ouvert == true) {
            contenuml = contenuml / contenupourcent;
            contenupourcent = 100;
            contenuml = contenuml * contenupourcent;
        } else if (ouvert == false) {
            System.out.println("Opération ratée, la bouteille est fermée");
        }

        return ouvert;

    }

    public boolean viderfull() {
        if (ouvert == true) {
            contenuml = contenuml / contenupourcent;
            contenupourcent = 0;
            contenuml = contenuml * contenupourcent;
        } else if (ouvert == false) {
            System.out.println("Opération ratée, la bouteille est fermée");
        }

        return ouvert;

    }

    public float pourcentageremplir(float pourcentage) {
        if (ouvert == true && contenupourcent + pourcentage <= 100) {
            contenuml = (contenuml / contenupourcent);
            contenupourcent = contenupourcent + pourcentage;
            contenuml = contenuml * (contenupourcent);
        } else if (ouvert == true && contenupourcent + pourcentage > 100) {
            contenuml = contenuml / contenupourcent;
            contenupourcent = 100;
            contenuml = contenuml * contenupourcent;

        } else if (ouvert == false) {
            System.out.println("Opération ratée, la bouteille est fermée");
        }

        return pourcentage;
    }

    public float pourcentagevider(float pourcentage) {
        if (ouvert == true && contenupourcent - pourcentage >= 0) {
            contenuml = (contenuml / contenupourcent);
            contenupourcent = contenupourcent - pourcentage;
            contenuml = contenuml * (contenupourcent);
        } else if (ouvert == true && contenupourcent - pourcentage < 0) {
            contenupourcent = 0;
            contenuml = 0;

        } else if (ouvert == false) {
            System.out.println("Opération ratée, la bouteille est fermée");
        }

        return pourcentage;
    }

    public void afficherInformations() {

        System.out.println("Etat de la bouteille :  " + ouvert);
        System.out.println("Contenu en millilitres :  " + contenuml);
        System.out.println("Pourcentage de remplissage :  " + contenupourcent);

    }

}
