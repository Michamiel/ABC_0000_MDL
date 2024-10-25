import java.util.Scanner;

public class E34lasomme {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer un nombre.");

        int valeurinitiale;
        Scanner scanner = new Scanner(System.in);
        valeurinitiale = scanner.nextInt();

        int valeur = valeurinitiale + 1;
        int somme = 0;

        while (valeur > 1) {
            valeur--;

            somme = valeur + somme;

        }

        System.out.println("\n La somme des nombres jusqu'à " + valeurinitiale + " est " + somme);

    }
}
