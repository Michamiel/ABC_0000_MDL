import java.util.Scanner;

public class E32labonneplagedegalets {

    public static void main(String[] args){

        System.out.println("\n Veuillez entrer un nombre compris entre 10 et 20.");

        int condition = 0;

        while(condition == 0){

        int réponse;
        Scanner scanner = new Scanner(System.in);
        réponse = scanner.nextInt();

        if (réponse <= 9 ) {
            System.out.println( "\n" + réponse + " : Plus grand... ");
            
        } 
        else if (réponse >= 21) {
            System.out.println( "\n" + réponse + " : Plus petit...  !");
        } 
        else{

            condition = condition +1 ;
            System.out.println( "\n" + réponse + " : Yes, you did it !");
           }
        
        }


    }

}
