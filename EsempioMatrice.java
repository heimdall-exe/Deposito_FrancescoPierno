public class EsempioMatrice {
    public static void main(String[] args) {
        int[][] matrice = new int[3][3];

        int[][] matricePredefinita = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elemento centrale: " + matrice[1][1]);

        //matrice 3x3

         int[][] matricex = new int[3][3];
         int valore=1;

         for(int i=1; i<=matricex.length; i++){
            for(int j=1; j<=matricex.length; j++){
                matricex [i][j] = valore ++;
            }
         }

         //stampa della matrice
         System.out.println("Matrice 3x3");

         for(int i=1; i<=matricex.length; i++){
            for(int j=1; j<=matricex[i].length; j++){
                System.out.println(matrice[i][j] + "\t");
            }
            System.out.println();
         }
    }
}
