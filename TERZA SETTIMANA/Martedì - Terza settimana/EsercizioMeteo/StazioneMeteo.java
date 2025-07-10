package EsercizioMeteo;

import java.util.ArrayList;
import java.util.List;

//creiamo la stazione meteo con la lista dei vari display e i suoi metodi per aggiungere, rimuovere etc
    public class StazioneMeteo {
    private List<Display> displays = new ArrayList<>();
    private float temperatura;

    public void aggiungiDisplay(Display display) {
        displays.add(display);
    }

    public void rimuoviDisplay(Display display) {
        displays.remove(display);
    }

    private void notificaDisplay() {
        for (Display d : displays) {
            d.aggiorna(temperatura);
        }
    }

    //infine il metodo che aggiorna la temperatura e stampa la notifica in base al display
    public void setTemperatura(float t) {
        this.temperatura = t;
        notificaDisplay();
    }
}
