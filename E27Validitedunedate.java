import java.util.Scanner;

public class E27Validitedunedate {

    public static void main(String[] args) {



        System.out.println("\n Veuillez entrer un numéro de jour.");
        Scanner scanner = new Scanner(System.in);
        int jour = scanner.nextInt();

        System.out.println("\n Veuillez entrer un numéro de mois.");
        Scanner scanner2 = new Scanner(System.in);
        int mois = scanner2.nextInt();

        System.out.println("\n Veuillez entrer un numéro d'année.");
        Scanner scanner3 = new Scanner(System.in);
        int année = scanner3.nextInt();

        if (année % 4 == 0 && année % 100 != 0 || année % 400 == 400) {

            if (mois > 0 && mois < 13) {

                if (mois == 2) {

                    if (jour > 0 && jour < 30) {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " est une date valable.");;

                    } else {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
                    }
                } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {

                    if (jour > 0 && jour < 31) {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " est une date valable.");;

                    } else {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
                    }

                } else {
                    if (jour > 0 && jour < 32) {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " est une date valable.");;

                    } else {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
                    }

                }
            } else {
                System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
            }

        }

        else {

            if (mois > 0 && mois < 13) {

                if (mois == 2) {

                    if (jour > 0 && jour < 29) {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " est une date valable.");

                    } else {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
                    }
                } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {

                    if (jour > 0 && jour < 31) {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " est une date valable.");

                    } else {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
                    }

                } else {
                    if (jour > 0 && jour < 32) {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " est une date valable.");

                    } else {

                        System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
                    }

                }
            } else {
                System.out.println("\n " + jour + "/" + mois + "/" + année + " n'est PAS une date valable, dommage !.");
            }

        }

    

    }

}
