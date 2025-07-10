package EsercizioPaninoteca;
import java.util.ArrayList;
import java.util.Scanner;

public class HamburgeriaMain {
    public static void main(String[] args) {

        //impostiamo tutti i tool che ci servono
        Scanner sc = new Scanner(System.in);
        ArrayList<Hamburger> ordini = new ArrayList<>();
        boolean continuare = true;

        //ciclo while per il menu utente
        while (continuare) {
            System.out.println("MENU HAMBURGERIA DA CICCIOS");
            System.out.println("Che minghia vuoi ordinare?");
            System.out.println("1. Cheeseburger");
            System.out.println("2. VegBurger");
            System.out.println("3. DoubleBacon");
            System.out.println("4. Termina ordine e prepara");
            System.out.print("Seleziona il panino (1-3) oppure termina ordine e paga (4): ");

            int scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    ordini.add(new Cheeseburger());
                    break;
                case 2:
                    ordini.add(new VegBurger());
                    break;
                case 3:
                    ordini.add(new DoubleBacon());
                    break;
                case 4:
                    continuare = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Prenditi un panino, cornuto.");
            }
        }

        //dopo aver raccolto tutti gli ordini, stampiamo lo "scontrino" con un for each in modo che prepari ogni ordine singolarmente
        System.out.println("\nORDINI IN PREPARAZIONE");
        for (Hamburger burghir : ordini) {
            System.out.println("Ordine: " + burghir.getNomePanino());
            burghir.prepara();

            System.out.println("CIAO CORNUTO, INGOZZATI!!!");
        }

        sc.close();
    }
}
