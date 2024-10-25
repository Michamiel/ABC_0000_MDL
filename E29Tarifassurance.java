public class E29Tarifassurance {

    public static void main(String[] args) {

        int age = 24;
        int ap =1;
        int accident = 3;
        int assure = 1;
        int valeur = 0;

        if (ap > 1) {
            valeur = valeur + 1;
        }
        if (age > 25) {
            valeur = valeur + 1;
        }
        if (assure > 4) {
            valeur = valeur + 1;
        }
        if (accident == 0) {
            valeur = valeur + 1;
        } else if (accident == 1) {
            valeur = valeur + 0;
        } else if (accident == 2) {
            valeur = valeur - 1;
        } else if (accident > 2) {
            valeur = 0;
        }

        if (valeur < 1) {

            System.out.println("\n La compagnie refuse de vous assurer.");
        }
        if (valeur == 1) {

            System.out.println("\n vous pouvez bénéficier du tarif rouge");
        }
        if (valeur == 2) {

            System.out.println("\n vous pouvez bénéficier du tarif orange");
        }
        if (valeur == 3) {

            System.out.println("\n vous pouvez bénéficier du taif vert");
        }
        if (valeur == 4) {

            System.out.println("\n Vous pouvez bénéficier du tarif bleu");
        }
    }
}
