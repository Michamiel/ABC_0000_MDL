import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EXERCICEDEMICHAEL {

    public static void main(String[] args) {

        String nom;
        String date = "";
        String métier;
        String couleur;

        LocalDate datedujour = LocalDate.now();
        System.out.println("\n" + datedujour);

        System.out.print("\n Veuillez entrer votre nom et votre prénom : ");

        Scanner scanner = new Scanner(System.in);
        nom = scanner.nextLine();

        System.out.println(nom);

        System.out.print("\n Veuillez à présent entrer votre date de naissance au format jj/mm/aaaa: ");

        Scanner scanner2 = new Scanner(System.in);
        date = scanner2.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate naissance = LocalDate.parse(date, formatter);
        System.out.println(formatter.format(naissance));

        System.out.println(naissance);
        
int age = datedujour.getYear() - naissance.getYear();

        if ( age > 18) {

        System.out.print("\n Veuillez à présent entrer votre métier: ");

        Scanner scanner3 = new Scanner(System.in);
        métier = scanner3.nextLine();

        System.out.println(nom + " - " + date + " - " + métier);

        } else {

        System.out.print("\n Veuillez à présent entrer votre couleur préférée: ");

        Scanner scanner4 = new Scanner(System.in);
        couleur = scanner4.nextLine();

        System.out.println(nom + " - " + date + " - " + couleur);

        }

    }

}
