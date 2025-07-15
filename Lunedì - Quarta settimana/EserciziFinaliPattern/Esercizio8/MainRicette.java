import java.util.Scanner;

public class MainRicette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleziona una dieta (vegana, carnivora, standard):");
        String sceltaUtente = scanner.nextLine().toLowerCase();

        StrategiaSelezioneRicette strategia = null;

        if (sceltaUtente.equals("vegana")) {
            strategia = new StrategiaVegana();
        } else if (sceltaUtente.equals("carnivora")) {
            strategia = new StrategiaCarnivora();
        } else if (sceltaUtente.equals("standard")) {
            strategia = new StrategiaStandard();
        } else {
            System.out.println("Tipo di dieta non valido.");
            scanner.close();
            return;
        }

        SuggeritoreRicette suggeritore = new SuggeritoreRicette(strategia);
        suggeritore.mostraSuggerimenti();

        scanner.close();
    } 
}