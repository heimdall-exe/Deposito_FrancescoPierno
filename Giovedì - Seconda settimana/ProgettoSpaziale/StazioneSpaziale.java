package ProgettoSpaziale;
import java.util.ArrayList;

public class StazioneSpaziale {
    //creiamo liste per gli esperimenti e per le valutazioni delle rispettive sottoclassi
    private ArrayList<String> listaEsperimenti = new ArrayList<>();
    private ArrayList<Integer> listaValutazioni = new ArrayList<>();

    //metodo per aggiungere gli esperimenti alla lista
    public void aggiungiEsperimento(String nomeEsperimento) {
        listaEsperimenti.add(nomeEsperimento);
    }

    //metodo per aggiungere valutazioni alla lista
    public void aggiungiValutazione(int valutazione) {
        if (valutazione >= 1 && valutazione <= 5) {
            listaValutazioni.add(valutazione);
        } else {
            System.out.println("Valutazione non valida.");
        }
    }

    public ArrayList<String> getEsperimenti() {
        return listaEsperimenti;
    }

    public ArrayList<Integer> getValutazioni() {
        return listaValutazioni;
    }
}
