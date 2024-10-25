import java.util.Scanner;

public class E23macategorieaufootball {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer votre âge");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 5) {

            System.out.println("\n Votre enfant est trop jeune pour s'inscrire, revenez l'année prochaine !");
        }
        else if (age > 4 && age < 7) {

            System.out.println("\n Votre catégorie est : Débutant");
        }
        else if (age > 6 && age < 9) {

            System.out.println("\n Votre catégorie est : Poussin");
        }

        else if (age > 8 && age < 11) {

            System.out.println("\n Votre catégorie est : Benjamin");
        }

        else if (age > 10 && age < 13) {

            System.out.println("\n Votre catégorie est : Pupille");
        }
        else if (age > 12 && age < 15) {

            System.out.println("\n Votre catégorie est : Minime");
        }
        else if (age > 14 && age < 17) {

            System.out.println("\n Votre catégorie est : Cadet");
        }
        else if (age > 16 && age < 19) {

            System.out.println("\n Votre catégorie est : Junior");
        }
        else if (age > 18 && age < 35) {

            System.out.println("\n Votre catégorie est : Sénior");
        }
        else if (age > 34) {

            System.out.println("\n Votre catégorie est : Vétéran");
        }

    }
}
