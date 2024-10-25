import java.util.Scanner;

public class E35lafactorielle {

  public static void main(String[] args) {

    System.out.println("Veuillez entrer un nombre.");

    int valeurinitiale;
    Scanner scanner = new Scanner(System.in);
    valeurinitiale = scanner.nextInt();

    int valeur = valeurinitiale + 1;
    int fact = 1;

  

    while (valeur > 1) {
      valeur--;

      fact = valeur * fact;

    }

    System.out.println("\n La factorielle de " + valeurinitiale + " est " + fact);

  }
}
