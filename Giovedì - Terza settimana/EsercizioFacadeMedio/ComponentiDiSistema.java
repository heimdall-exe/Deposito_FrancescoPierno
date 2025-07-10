package EsercizioFacadeMedio;

// Componenti del sistema

class Bios {
    public void inizializza() {
        System.out.println("BIOS dice: BIP-BOP...inizializzazione...");
    }
}

class HardDisk {
    public void carica() {
        System.out.println("HardDisk dice: BZZZZ-BOP...caricamento dei dati...");
    }
}

// DESIGN PATTER AGGIUNTIVO 1: Singleton, rendo SistemaOperativo l'unica istanza (come nella realtà)
class SistemaOperativo {
    private static SistemaOperativo instance;

    private SistemaOperativo() {}

    public static SistemaOperativo getInstance() {
        if (instance == null) {
            instance = new SistemaOperativo();
        }
        return instance;
    }

    public void avvia() {
        System.out.println("Sistema Operativo: BIP BOP BUP, AVVIO COMPLETATO, SACCO DI CARNE!");
    }
}

// DESIGN PATTER AGGIUNTIVO 2: Observer, creo AvvioUtente che notifichi l'utente quando il sistema è avviato
interface AvvioUtente {
    void onAvvioCompletato();
}

class Utente implements AvvioUtente {
    public void onAvvioCompletato() {
        System.out.println("Utente: BIP BZZZZ BOP! Il computer è pronto per l'uso.");
    }
}

// DESIGN PATTERN OBBLIGATORIO: Facade
class ComputerFacade {
    private Bios bios;
    private HardDisk hardDisk;
    private SistemaOperativo sistemaOperativo;
    private AvvioUtente utenteNotificato;

    public ComputerFacade(AvvioUtente utenteNotificato) {
        this.bios = new Bios();
        this.hardDisk = new HardDisk();
        this.sistemaOperativo = SistemaOperativo.getInstance();
        this.utenteNotificato = utenteNotificato;
    }

    //Metodo che notifica l'utente, tramite l'Observer, quando il sistema è pronto
    public void accendiComputer() {
        System.out.println("BROOM, BROOM! Avvio computer in corso...");
        bios.inizializza();
        hardDisk.carica();
        sistemaOperativo.avvia();
        if (utenteNotificato != null) {
            utenteNotificato.onAvvioCompletato();
        }
    }
}