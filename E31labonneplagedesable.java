import java.util.Scanner;

public class E31labonneplagedesable {

    public static void main(String[] args) {

        System.out.println("Veuillez entrer un nombre compris entre 1 et 3.");


        int réponse;
        Scanner scanner = new Scanner(System.in);

        réponse = scanner.nextInt();

        
        if (réponse >= 1 && réponse <= 3) {
            System.out.println( "\n" + réponse + " : Bravo, vous avez réussi !");
        } else {

            System.out.println("\n Veuillez entrer un nombre compris entre 1 et 3.");

        }

    }

}
