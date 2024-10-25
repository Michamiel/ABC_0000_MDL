public class tableauxetfonctions {

    public static void main(String[] args) {

        int[] myarray; // je déclare le tableau "array"
        myarray = new int[10]; // j'alloue 10 cases de type Int au tableau

        String[] saison = new String[4]; // 4 cellules de types String

        saison[0] = "hiver";
        saison[1] = "Printemps";
        saison[2] = "Summer";
        saison[3] = "Automne";

        int tub[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < tub.length; i++) {
            System.out.println(tub[i]);

        }

        String [] Tab = {"Paris","Londres","Tokyo"};
Tab [1] = "Nouméa";


        for(int i = 0; i < Tab.length ;  i++){
            System.out.println("Valeur " +i+ " : "+Tab[i]);

        }

    }

}
