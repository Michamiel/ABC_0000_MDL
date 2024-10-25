import java.util.Scanner;

public class E24jepredislavenir {

    public static void main(String[] args) {

        System.out.println(" \n Veuillez entrer l'heure actuelle (sans les minutes).");

        int heures;
        Scanner scanner = new Scanner(System.in);
        heures = scanner.nextInt();

        System.out.println("Veuillez entrer les minutes actuelles).");

        int minutes;
        Scanner scanner2 = new Scanner(System.in);
        minutes = scanner2.nextInt();

        int minutesnow = (minutes + 3);
        if (minutesnow >= 60) {

            minutesnow = minutesnow - 60;
            heures = heures + 1;

            if (heures >= 24) {

                heures = heures - 24;
            }

        }

        System.out.println("Il sera " + heures + " heures et " + minutesnow + " minutes dans trois minutes");

    }

}
