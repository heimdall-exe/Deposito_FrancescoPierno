package EsercizioFacadeMedio;

public class Main {
    public static void main(String[] args) {
        AvvioUtente utente = new Utente();
        ComputerFacade facade = new ComputerFacade(utente);
        facade.accendiComputer();
    }
}