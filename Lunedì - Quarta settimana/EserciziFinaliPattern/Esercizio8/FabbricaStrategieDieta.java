public class FabbricaStrategieDieta {
    //FACTORY METHOD
    public static StrategiaSelezioneRicette creaStrategia(String tipoDieta) {
        return switch (tipoDieta.toLowerCase()) {
            case "vegana" -> new StrategiaVegana();
            case "carnivora" -> new StrategiaCarnivora();
            case "standard" -> new StrategiaStandard();
            default -> throw new IllegalArgumentException("Tipo di dieta non supportato: " + tipoDieta);
        };
    }
}
