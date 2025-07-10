package EsercizioDecoratorFacile;

public class MainFacile {
    public static void main(String[] args) {
        Messaggio semplice = new MessaggioBase();
        Messaggio maiuscolo = new DecoratoreMaiuscolo(semplice);

        System.out.println("Messaggio originale: " + semplice.getContenuto());
        System.out.println("Messaggio decorato: " + maiuscolo.getContenuto());
    }
}
