import java.util.Scanner;

public class JeudeNim {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer le nombre d'allumettes de départ");

        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        boolean AIplay = false;

        while (left > 1) {
            if (AIplay == false) {

                System.out.println("Il y a " + left + " allumettes. C'est à vous de jouer, retirez-en 1, 2 ou 3");

                int answer = scanner.nextInt();

                if(answer > 3 || answer < 1) {

                    System.out.println("Erreur, veuillez entrer un nombre d'allumettes compris entre 1 et 3");

                }
                if (answer < 3 || answer > 1) {
                    left = left - answer;
                    if (left < 1) {
                        System.out.println("Vous avez pris la dernière allumette !  GAME OVER");
                    } 
                    else {
                        System.out.println("Il y a " + left + " allumettes. C'est à l'ordi de jouer");
                        AIplay = true;
                    }
                }

            }

            if (AIplay = true) {
                if (left % 4 == 2) {
                    left = left - 1;
                    System.out.println("L'ordi prends 1 allumette...");
                    if (left == 1) {
                        System.out.println(
                                "Vous êtes obligé de prendre la dernière allumette... Vous avez donc perdu ! GAME OVER");
                    } else {
                        AIplay = false;
                    }

                } else if (left % 4 == 3) {
                    left = left - 2;
                    System.out.println("L'ordi prends 2 allumettes...");
                    if (left == 1) {
                        System.out.println(
                                "Vous êtes obligé de prendre la dernière allumette... Vous avez donc perdu ! GAME OVER");
                    } else {
                        AIplay = false;
                    }

                } else if (left % 4 == 0) {
                    left = left - 3;
                    System.out.println("L'ordi prends 3 allumettes...");
                    if (left == 1) {
                        System.out.println(
                                "Vous êtes obligé de prendre la dernière allumette... Vous avez donc perdu ! GAME OVER");
                    } else {
                        AIplay = false;
                    }

                } else if (left % 4 == 1) {
                    left = left - 1;
                    System.out.println("L'ordi prends 1 allumette...");
                    if (left == 0) {
                        System.out.println(
                                "C'était la dernière, l'ordi a perdu... Vous avez donc GAGNE ! YOUPI");
                    } else {
                        AIplay = false;
                    }

                }
            }
        }

    }

}
