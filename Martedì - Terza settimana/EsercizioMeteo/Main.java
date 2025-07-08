package EsercizioMeteo;

public class Main {
    public static void main(String[] args) {
        StazioneMeteo stazione = new StazioneMeteo();

        Display console = new DisplayConsole();
        Display mobile = new DisplayMobile();

        stazione.aggiungiDisplay(console);
        stazione.aggiungiDisplay(mobile);

        stazione.setTemperatura(25.5f);
        stazione.setTemperatura(30.0f);
    }
}
