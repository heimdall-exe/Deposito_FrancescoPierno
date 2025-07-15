import java.util.List;

public class StrategiaVegana implements StrategiaSelezioneRicette {
    public List<String> suggerisciRicette() {
        return List.of("Erbetta di campo", "Carote con la terra", "Foglie di albero");
    }
}
