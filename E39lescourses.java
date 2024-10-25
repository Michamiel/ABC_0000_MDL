import java.util.Scanner;

public class E39lescourses {

    public static void main(String[] args) {

        System.out.println("\n Veuillez entrer le nombre de chevaux en lice");

        Scanner scanner = new Scanner(System.in);
        int horsego = scanner.nextInt();

        System.out.println("\n Sur combien d'entre eux allez vous parier ?");

        Scanner scanner2 = new Scanner(System.in);
        int horsebet = scanner2.nextInt();

        int ordre = 1;
        double désordre = 1;
        int condition = 0;

        while(condition < horsebet){
            condition++;
            ordre = ordre*horsego;
            horsego--;
            
        }
        
        
        while(horsebet > 0){
            
            désordre = (horsego/horsebet)*désordre;
            horsego--;
            horsebet--;

            System.out.println("\n Dans le  désordre : une chance sur " + désordre + " de gagner ");

            
        }

        System.out.println("\n Dans l'ordre : une chance sur " + ordre + " de gagner ");
       

    }

}
