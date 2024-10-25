import java.util.Scanner;

public class E28Elections {

    public static void main(String[] args) {

        System.out.println(
                "Nous allons examiner à présent les résultats des élections législatives de Guignolerie Septentrionale 2024 et l'issue de la candidature d'Emmanuel Maquereau.");

        System.out.println("Veuillez entrer le pourcentage obtenu par le candidat 1 Emmanuel Maquereau.");
        Scanner scanner = new Scanner(System.in);
        int candidat1 = scanner.nextInt();

        System.out.println("Veuillez entrer le pourcentage obtenu par la candidate 2 Marine Lapine.");
        Scanner scanner2 = new Scanner(System.in);
        int candidat2 = scanner2.nextInt();

        System.out.println("Veuillez entrer le pourcentage obtenu par le candidat 3 Jean-luc Cochon.");
        Scanner scanner3 = new Scanner(System.in);
        int candidat3 = scanner3.nextInt();

        System.out.println("Veuillez entrer le pourcentage obtenu par la candidate 4 Valérie Pécarisse.");
        Scanner scanner4 = new Scanner(System.in);
        int candidat4 = scanner4.nextInt();

        if (candidat1 + candidat2 + candidat3 + candidat4 == 100) {

            if (candidat1 > 50) {

                System.out.println("Avec " + candidat1
                        + "% des voix, Emmanuel Maquereau remporte les élections législatives, bravo !");

            } else if (candidat2 >= 50 || candidat3 >= 50 || candidat4 >= 50) {

                System.out.println(
                        "Malheureusement, un adversaire d'Emmanuel Maquereau a remporté plus de 50% des suffrages et remporté cette élection dés le premier tour... Emmanuel Maquereau a PERDU ! ");

            } else if (candidat1 < 50 && candidat1 > 12.5 && candidat1 > candidat2 && candidat1 > candidat3
                    && candidat1 > candidat4) {

                System.out.println("Avec " + candidat1
                        + "% des voix, Emmanuel Maquereau n'a pas la majorité, mais est en tête et donc en ballotage favorable pour remporter ces élections législatives");

            } else if (candidat1 < 50 && candidat1 > 12.5 && candidat1 > candidat2 || candidat1 > candidat3
                    || candidat1 > candidat4) {

                System.out.println("Avec " + candidat1
                        + "% des voix, Emmanuel Maquereau est en ballotage défavorable car il a le minimum de suffrages requis mais n'est pas en tête");

            } else if (candidat1 < 12.5) {

                System.out.println("Avec " + candidat1
                        + "% des voix, Emmanuel Maquereau n'a pas le minimum de suffrages requis, il est donc ELIMINE ! Quel dommage !");

            }

        } else {

            System.out
                    .println("Le total des pourcentages n'équivaut pas 100%, essaieriez vous de truquer l'élection ? ");
        }

    }

}
