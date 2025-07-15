import java.util.List;

public class StrategiaStandard implements StrategiaSelezioneRicette{
    public List<String> suggerisciRicette() {
        return List.of("Pizza", "Pasta al pomodoro", "Lasagne");
    }
}
