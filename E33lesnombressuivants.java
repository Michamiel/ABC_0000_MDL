import java.util.Scanner;

public class E33lesnombressuivants {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer un nombre.");

        int réponse;
        Scanner scanner = new Scanner(System.in);
        réponse = scanner.nextInt();
        int condition = 0;

        System.out.print("\n Les dix nombres après " + réponse + " sont ");

        while (condition < 9) {

            condition++;
            réponse++;
            System.out.print(réponse + ", ");

        }
        while (condition < 10) {

            condition++;
            réponse++;
            System.out.print(réponse);

        }

    }

}
