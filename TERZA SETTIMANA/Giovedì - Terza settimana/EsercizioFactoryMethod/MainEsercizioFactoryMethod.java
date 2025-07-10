package EsercizioFactoryMethod;
import java.util.Scanner;

// Interfaccia IVeicolo
interface IVeicolo {
    void Avvia();
    void MostraTipo();
}

// Classi concrete che implementano tutte l'interfaccia IVeicolo e differiscono fra loro
class Auto implements IVeicolo {
    public void Avvia() {
        System.out.println("Avvio dell'auto");
    }

    public void MostraTipo() {
        System.out.println("Tipo: Auto");
    }
}

class Moto implements IVeicolo {
    public void Avvia() {
        System.out.println("Avvio della moto");
    }

    public void MostraTipo() {
        System.out.println("Tipo: Moto");
    }
}

class Camion implements IVeicolo {
    public void Avvia() {
        System.out.println("Avvio del camion");
    }

    public void MostraTipo() {
        System.out.println("Tipo: Camion");
    }
}

// poi la classe factory con lo switch per determinare ogni casistica
class VeicoloFactory {
    public static IVeicolo CreaVeicolo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto();
            case "moto":
                return new Moto();
            case "camion":
                return new Camion();
            default:
                System.out.println("Tipo di veicolo non riconosciuto.");
                return null;
        }
    }
}

// Main
public class MainEsercizioFactoryMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quale veicolo vuoi creare (auto/moto/camion)? ");
        String tipo = sc.nextLine();

        IVeicolo veicolo = VeicoloFactory.CreaVeicolo(tipo);

        if (veicolo != null) {
            veicolo.Avvia();
            veicolo.MostraTipo();
        }
        
        sc.close();
    }
}
