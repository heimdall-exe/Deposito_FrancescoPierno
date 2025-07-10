package ProgettoSpaziale;
import java.util.Scanner;
import ProgettoSpaziale.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inizializzo l'astronauta come null perchè all'inizio del programma non ce n'è uno, e non so di quale sottoclasse sarà
        Astronauta astronauta = null;
        StazioneSpaziale stazione = new StazioneSpaziale();

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("Come posso aiutarti?");
            System.out.println("1. Crea nuovo astronauta");
            System.out.println("2. Visualizza dati astronauta");
            System.out.println("3. Login (rigenera ossigeno)");
            System.out.println("4. Interagisci");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            int scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Qual è il tuo pianeta preferito? ");
                    String risposta = sc.nextLine();

                    if (risposta.equalsIgnoreCase("Paperino")) {
                        astronauta = new Scienziato(nome, email);
                    } else {
                        astronauta = new Ispettore(nome, email);
                    }
                    break;

                case 2:
                    if (astronauta != null) {
                        System.out.println(astronauta.stampaDettagli());
                    } else {
                        System.out.println("Nessun astronauta creato.");
                    }
                    break;

                case 3:
                    if (astronauta != null) {
                        astronauta.rigeneraOssigeno();
                        System.out.println("Ossigeno rigenerato correttamente. Non morirai oggi :D.");
                    }
                    break;

                case 4:
                    if (astronauta != null) {
                        astronauta.interagisci(stazione);

                        // Funzioni avanzate
                        if (astronauta instanceof Scienziato s && s.isScienziatoCapo()) {
                            s.stampaEsperimenti(stazione);
                        } else if (astronauta instanceof Ispettore i && i.isIspettoreEsperto()) {
                            i.stampaValutazioni(stazione);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Uscita dal programma. Alla prossima! :D");
                    return;

                default:
                    System.out.println("Scelta non valida, pezzo di carne. Inseriscine una valida oppure ti spedisco nel gelo siderale dello spazio.");
            }
        }
    }
}