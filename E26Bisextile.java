import java.util.Scanner;

public class E26Bisextile {

    public static void main(String[] args) {

System.out.println("\n Veuillez entrer une année");

        Scanner scanner = new Scanner(System.in);
        int année = scanner.nextInt();

        if(année%4 == 0 && année%100 !=0 || année%400 == 400){
        System.out.println(année + " est bisextile.");
        }
        else{
            System.out.println(année + " n'est pas bisextile.");
            }



    }

}
