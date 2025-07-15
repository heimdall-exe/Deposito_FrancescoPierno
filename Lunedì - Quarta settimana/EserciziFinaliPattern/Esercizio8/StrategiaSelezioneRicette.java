import java.util.List;

//STRATEGY ASTRATTA, LE ALTRE STRATEGIE SONO LE CONCRETE CHE IMPLEMENTANO QUESTA
public interface StrategiaSelezioneRicette {
    List<String> suggerisciRicette();
}
