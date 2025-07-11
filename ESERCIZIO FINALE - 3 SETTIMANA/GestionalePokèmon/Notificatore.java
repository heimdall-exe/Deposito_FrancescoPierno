package GestionalePokèmon;

import java.util.ArrayList;
import java.util.List;

public class Notificatore {
    private static Notificatore instance;
    private List<Osservatore> osservatori = new ArrayList<>();

    private Notificatore() {}

    public static Notificatore getInstance() {
        if (instance == null) {
            instance = new Notificatore();
        }
        return instance;
    }

    public void iscrivi(Osservatore o) {
        if (!osservatori.contains(o)) {
            osservatori.add(o);
        }
    }

    public void disiscrivi(Osservatore o) {
        osservatori.remove(o);
    }

    public void notify(String messaggio) {
        for (Osservatore o : osservatori) {
            o.riceviNotifica(messaggio);
        }
    }
}