package EsercizioBorsa;

import java.util.ArrayList;
import java.util.List;

public class AgenziaBorsa {
    private static AgenziaBorsa istanzaSingleton; // Singleton statico

    private List<Investitore> investitori = new ArrayList<>();

    // mettiamo il costruttore privato
    private AgenziaBorsa() {}

    // e qua il metodo statico per ottenere l'unica istanza
    public static AgenziaBorsa getIstanza() {
        if (istanzaSingleton == null) {
            istanzaSingleton = new AgenziaBorsa();
        }
        return istanzaSingleton;
    }

    //poi i vari metodi classici per fare tutte le robe
    public void aggiungiInvestitore(Investitore investitore) {
        investitori.add(investitore);
    }

    public void rimuoviInvestitore(Investitore investitore) {
        investitori.remove(investitore);
    }

    private void notificaInvestitori(String azione, double valore) {
        for (Investitore i : investitori) {
            i.notifica(azione, valore);
        }
    }

    public void aggiornaValoreAzioni(String nome, double valore) {
        System.out.println("L'azione " + nome + " è stata aggiornata a " + valore + "€");
        notificaInvestitori(nome, valore);
    }
}