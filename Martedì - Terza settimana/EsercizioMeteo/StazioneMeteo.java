package EsercizioMeteo;

import java.util.ArrayList;
import java.util.List;

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

    public void setTemperatura(float t) {
        this.temperatura = t;
        notificaDisplay();
    }
}
