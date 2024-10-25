import java.util.Scanner;

public class E36etleplusgrandest {

    public static void main(String[] args) {


        int higher = 0;
        int numero = 0;

        for (int condition = 1; condition <= 20; condition++) {

            System.out.print("\n Entrez le nombre numéro " + condition + " : ");

            Scanner scanner = new Scanner(System.in);
            int réponse = scanner.nextInt();

            if (réponse > higher) {

                higher = réponse;
                numero = condition;

            }

        }

        System.out.print("\n Résultat :");
        System.out.print("\n Le plus grand des nombres saisis est : " + higher);
        System.out.print("\n " + "était le nombre numéro : " + numero);


    }

}
