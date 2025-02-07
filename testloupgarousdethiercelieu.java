import java.util.Scanner;

public class testloupgarousdethiercelieu {

    public static void main(String[] args) {

        System.out.println("\n Loups-garous de thiercelieux : les probabilités du couple");

        Scanner scanner = new Scanner(System.in);
        double joueurs;
        double loups;
        String cupidon;
        double probabilité0;
        double probabilité1;
        double probabilité2;
        double probabilitémin;
        int condition = 0;

        System.out.println("\n Entrez le nombre de joueur au total");

        do {
            joueurs = scanner.nextDouble();

            if (joueurs < 6) {
                System.out.println("Y'a même pas assez de joueur pour faire une partie... Jouez plutot au Uno.");
            }
            if (joueurs % 1 != 0) {
                System.out.println(
                        "Vous jouez avec des joueurs pas entiers ? ... Remarque, il se sont peut-être fait manger par des loups mais il faut entrer uniquement un nombre de joueurs entier svp.");
            }

        } while (joueurs < 6 || joueurs % 1 != 0);

        if (joueurs > 25 && joueurs < 51) {
            System.out.println("Vous jouez à autant de joueurs que ça ? Bon courage...");
        }
        if (joueurs > 50) {
            System.out.println(
                    "Non sérieusement, vous jouez pas réellement à autant, vous testez juste les limites du programme là hein ? Bon, ça n'empêche pas de le faire fonctionner, alors si ça va vous chante, allez-y !");
        }

        System.out.println("\n Entrez le nombre de potentiels loup-garous");
        do {
            loups = scanner.nextDouble();
            if (loups == joueurs) {

                System.out.println(
                        "Lol, il n'y a même plus assez de joueurs pour y mettre un cupidon, saisissez un chiffre plus faible.");
            }

            if (loups % 1 != 0) {
                System.out.println(
                        "Désolé mais peu importe si vous utilisez des rôles de loups particuliers, vous devez écrire un nombre de loups entier.");
            }
            if (loups > joueurs) {
                System.out.println(
                        "Ben alors, vous avez mis plus de loups que de joueurs... Saisissez un nombre plus faible.");
            }

        } while (loups >= joueurs - 1 || loups % 1 != 0);

        if (loups > joueurs / 3) {

            System.out.println(
                    "J'ai l'impression que vous abusez un peu sur le nombre de loups, j'espère que vous avez beaucoup de contres dans le camp des villageois, sinon il vont souffrir les pauvres. C'est vous qui voyez...");
        }

        System.out.println("Cupidon peut-il se désigner comme amoureux ? Tapez oui ou non");

        do {
            cupidon = scanner.next();

            if (cupidon.contentEquals("non")) {

                joueurs = joueurs - 1;
                condition = 1;

            } else if (cupidon.contentEquals("oui")) {
                joueurs = joueurs + 0;
                condition = 1;
            } else {
                System.out.println("Réponse incomprise, veuillez écrire Oui ou Non");
            }
        } while (condition == 0);

        probabilité0 = ((joueurs-loups)/joueurs)*((joueurs - 1)-loups)/(joueurs-1);
        probabilité2 = (loups/joueurs)*((loups-1)/(joueurs-1));
        probabilité1 = 1 - probabilité0 - probabilité2;
        probabilitémin = 1-probabilité0;

        System.out.println("La probabilité d'avoir au moins un loup-garou parmis les deux amoureux est de "
                + probabilitémin * 100 + "%.");
        System.out.println("La probabilité de n'avoir aucun loup-garou parmis les deux amoureux est de "
                + probabilité0 * 100 + "%.");
        System.out.println("La probabilité d'avoir un seul loup-garou parmis les deux amoureux est de "
                + probabilité1 * 100 + "%.");
        System.out.println("Et enfin, la probabilité que les deux amoureux soient loup-garous est de "
                + probabilité2 * 100 + "%.");

        scanner.close();

    }

}
