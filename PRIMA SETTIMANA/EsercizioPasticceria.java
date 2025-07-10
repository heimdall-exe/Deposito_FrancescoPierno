import java.util.Scanner;

public class EsercizioPasticceria {
    public static void main(String[] args) {

        final int orderMax = 10;
        String[] dessertName = new String[orderMax];
        int[] dessertQuantity = new int[orderMax];

        Scanner sc = new Scanner(System.in);

        System.out.print("How many dessert types do you want to order (max 10)? ");
        int dessertNumber = sc.nextInt();
        sc.nextLine(); 

        while (dessertNumber < 1 || dessertNumber > orderMax) {
            System.out.print("Invalid number, must be between 1 and 10.");
            dessertNumber = sc.nextInt();
            sc.nextLine(); 
        }

        for (int i = 0; i < dessertNumber; i++) {
            System.out.print("Insert the number " + (i + 1) + " desserts name: ");
            dessertName[i] = sc.nextLine();

            //chiediamo quanti dolci di quel tipo vuole
            int howMuch;
            do {
                System.out.print("Insert how many \"" + dessertName[i] + "\"you want: ");
                howMuch = sc.nextInt();
                if (howMuch < 0) {
                    System.out.println("Quantity can't be negative.");
                }
            } while (howMuch < 0);

            dessertQuantity[i] = howMuch;
            sc.nextLine(); 
        }

        // Stampiamo gli ordini
        System.out.println("\nOrders: ");
        int totalCheck = 0;
        for (int i = 0; i < dessertNumber; i++) {
            System.out.println("- " + dessertName[i] + ": " + dessertQuantity[i]);
            totalCheck += dessertQuantity[i];
        }

        // Stampa del totale
        System.out.println("\nTotal orders: " + totalCheck);
    }
}
