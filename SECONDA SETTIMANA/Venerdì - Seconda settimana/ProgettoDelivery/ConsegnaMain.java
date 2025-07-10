package ProgettoDelivery;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsegnaMain {
    public static void main(String[] args) {
        //prepariamo i tool necessari
        ArrayList<VeicoloConsegna> veicoli = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //prepariamo un ciclo di inserimento dei veicoli che ne determina il tipo
        System.out.println("Quanti veicoli vuoi aggiungere?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci tipo veicolo (furgone/drone): ");
            String tipoVeicolo = sc.nextLine();

            //e poi gli facciamo inserire la targa e il carico massimo del veicolo in questione
            System.out.println("Inserisci targa:");
            String targa = sc.nextLine();

            System.out.println("Inserisci carico massimo:");
            float carico = (sc.nextFloat());

            VeicoloConsegna veicolo = null;

            //verifichiamo e gestiamo i dati in base alle risposte
            if (tipoVeicolo.equalsIgnoreCase("furgone")) {
                veicolo = new Furgone(targa, carico);
            } else if (tipoVeicolo.equalsIgnoreCase("drone")) {
                veicolo = new Drone(targa, carico);
            }

            if (veicolo != null) {
                veicoli.add(veicolo);
            }

            //infine cicliamo la stampa per ogni veicolo
            for (VeicoloConsegna v : veicoli) {
            v.stampaInfo();
            v.consegnaPacco("Via Roma 1");

            if (v instanceof Tracciabile) {
                ((Tracciabile) v).tracciaConsegna("TRK123456");
            }
            System.out.println();
        }
        }
    }
    
}
