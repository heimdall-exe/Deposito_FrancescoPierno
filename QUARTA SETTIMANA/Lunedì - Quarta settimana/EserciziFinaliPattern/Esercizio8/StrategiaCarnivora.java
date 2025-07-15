import java.util.List;

public class StrategiaCarnivora implements StrategiaSelezioneRicette {
    public List<String> suggerisciRicette() {
        return List.of("Bisteccona gigante di t-rex", "2kg di pulled pork (mono porzione)", "mucca cruda (forse ancora in vita)");
    }
}
