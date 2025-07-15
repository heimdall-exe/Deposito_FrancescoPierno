import java.util.List;

//utilizziamo tutte le strategy create, in modo raggruppato
public class SuggeritoreRicette {
    private StrategiaSelezioneRicette strategia;

    public SuggeritoreRicette(StrategiaSelezioneRicette strategia) {
        this.strategia = strategia;
    }

    public void mostraSuggerimenti() {
        List<String> ricette = strategia.suggerisciRicette();
        System.out.println("Ricette suggerite:");
        for (String ricetta : ricette) {
                System.out.println(ricetta);
            }
    }
}