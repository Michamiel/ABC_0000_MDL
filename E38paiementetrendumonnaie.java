import java.util.Scanner;

public class E38paiementetrendumonnaie {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer le prix de chaque article. Quand vous avez terminé, entrez 0.");
        System.out.println("\n Premier article : ");

        double somme = 0;
        

        for (int condition = 1; condition != 0; condition++ ) {

            Scanner scanner = new Scanner(System.in);
            double article = scanner.nextInt();

            somme = article + somme;

            if (article == 0) {

                break;
            }

            System.out.println("Article suivant : ");
        }

        System.out.println("Prix total à payer :  " + somme);

        
        double rendu = (somme%5 -5)*(-1);
        double bill5 = (somme - somme%5)/5;
        if(rendu == 5){
            rendu = rendu - 5;
            
        }
        else{
            bill5 = bill5 +1;
        }


        System.out.println("Le client devra donner " + bill5 + " billets de 5 euros");
        if(rendu == 0){
            System.out.println("Il n'y a pas d'argent à lui rendre. ");
        }
        else{
        System.out.println("Il faudra alors lui rendre " + rendu + " euros, si possible sous la forme suivante : ");

        double coin2 = (rendu - rendu%2)/2;
        double rendub = (rendu%2 -2)*(-1);




        System.out.println(coin2);
        System.out.println(rendub);

        }

    }

}
