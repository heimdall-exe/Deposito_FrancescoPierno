package EsercizioStrategyEasy;

public class Main {
    public static void main(String[] args) {
        Calcolatore calcolatore = new Calcolatore();

        // Uso dell'addizione
        calcolatore.setStrategia(new Addizione());
        System.out.println("Addizione: 5 + 10 = " + calcolatore.eseguiOperazione(5, 10));

        // Cambio strategia , vado alla moltiplicazione
        calcolatore.setStrategia(new Moltiplicazione());
        System.out.println("Moltiplicazione: 5 * 10 = " + calcolatore.eseguiOperazione(5, 10));
    }
}