package ProgettoSpaziale;
import java.util.Scanner;

public class Scienziato extends Astronauta {

    public Scienziato(String nome, String email) {
        super(nome, email);
    }

    //Overridiamo il metodo interagisci per l'interazione dello Scienziato
    @Override
    public void interagisci(StazioneSpaziale stazione) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il nome dell'esperimento: ");
        String nomeEsperimento = sc.nextLine();
        stazione.aggiungiEsperimento(nomeEsperimento);
        azioniCompletate++; //incrementiamo il numero di azioni completate ad ogni esperimento effettuato
    }

    public boolean isScienziatoCapo() {     //alla terza come i Pokèmon si EVOLVE in SCIENZIATO  CAPO!!!
        return azioniCompletate >= 3;
    }

    //daje de stampa pure a lui
    public void stampaEsperimenti(StazioneSpaziale stazione) {
        System.out.println("Esperimenti: " + stazione.getEsperimenti());
    }
}
