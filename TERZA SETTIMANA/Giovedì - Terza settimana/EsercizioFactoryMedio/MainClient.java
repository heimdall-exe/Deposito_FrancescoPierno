package EsercizioFactoryMedio;

import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FacadeForma facade = new FacadeForma();

        System.out.print("Quale forma vuoi disegnare? (cerchio/quadrato): ");
        String tipo = sc.nextLine();

        System.out.print("Vuoi aggiungere un bordo? (si/no): ");
        boolean bordo = sc.nextLine().equalsIgnoreCase("si");

        System.out.print("Vuoi aggiungere un colore? (si/no): ");
        boolean colore = sc.nextLine().equalsIgnoreCase("si");

        try {
            facade.disegnaForme(tipo, bordo, colore);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}