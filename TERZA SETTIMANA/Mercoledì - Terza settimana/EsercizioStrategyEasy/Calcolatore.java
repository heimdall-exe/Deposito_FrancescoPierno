package EsercizioStrategyEasy;

public class Calcolatore {
    private Operazione strategia;

    public void setStrategia(Operazione strategia) {
        this.strategia = strategia;
    }

    public int eseguiOperazione(int a, int b) {
        if (strategia == null) {
            System.out.println("Strategia non impostata");        }
        return strategia.esegui(a, b);
    }
}