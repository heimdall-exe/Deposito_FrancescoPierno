package EsercizioSingleton;

public class Main {
    public static void main(String[] args) {
        // Primo uso del logger
        Logger logger1 = Logger.GetIstanza();
        logger1.ScriviMessaggio("Messaggio dal punto A");

        // Secondo uso del logger (altro punto del codice)
        Logger logger2 = Logger.GetIstanza();
        logger2.ScriviMessaggio("Messaggio dal punto B");

        // Verifica che siano la stessa istanza
        if (logger1 == logger2) {
            System.out.println("Conferma: è la stessa istanza di Logger.");
        } else {
            System.out.println("Errore: sono istanze diverse.");
        }
    }
}
