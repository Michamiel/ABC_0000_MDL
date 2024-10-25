import java.util.Scanner;

public class E25Reprographie {

    public static void main(String[] args) {

        System.out.println(" \n Veuillez entrer le nombre de photocopies à effectuer : ");

        double prix = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();

        System.out.println(nombre);

        while (count < nombre && count < 10) {

            count = count + 1;
            prix = prix + 0.10;

            while (count < nombre && count > 9 && count < 30) {

                count = count + 1;
                prix = prix + 0.09;

                while (count < nombre && count > 29) {
                    count = count + 1;
                    prix = prix + 0.08;
                }

            }

        }

        System.out.println("\n Le prix à payer pour " + nombre + " photocopies est " + prix + " euros.");

    }

}
