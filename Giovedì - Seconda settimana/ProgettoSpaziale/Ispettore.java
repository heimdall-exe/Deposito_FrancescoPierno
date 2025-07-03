package ProgettoSpaziale;
import java.util.Scanner;

public class Ispettore extends Astronauta {
    public Ispettore(String nome, String email) {
        super(nome, email);
    }

    //Overridiamo il metodo interagisci per l'interazione dello Scienziato
    @Override
    public void interagisci(StazioneSpaziale stazione) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la tua valutazione (da 1 a 5): ");
        int valutazione = sc.nextInt();
        stazione.aggiungiValutazione(valutazione);
        azioniCompletate++;
    }

    public boolean isIspettoreEsperto() {  //anche lui si evolve come i Pokèmon e diventa ISPETTORE ESPERTO!!!
        return azioniCompletate >= 3;
    }

    //e gli stampiamo le sue valutazioni
    public void stampaValutazioni(StazioneSpaziale stazione) {
        System.out.println("Valutazioni: " + stazione.getValutazioni());
    }
}
