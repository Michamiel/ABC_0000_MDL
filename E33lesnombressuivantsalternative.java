import java.util.Scanner;

public class E33lesnombressuivantsalternative {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer un nombre.");

        int réponse;
        Scanner scanner = new Scanner(System.in);
        réponse = scanner.nextInt();

        System.out.print("\n Les dix nombres après " + réponse + " sont ");

        for (int condition = 0; condition < 9; condition++) {
            réponse++;
            System.out.print(réponse + ", ");

        }
        for (int condition = 9; condition < 10; condition++) {

            réponse++;
            System.out.print(réponse);

        }

    }

}
