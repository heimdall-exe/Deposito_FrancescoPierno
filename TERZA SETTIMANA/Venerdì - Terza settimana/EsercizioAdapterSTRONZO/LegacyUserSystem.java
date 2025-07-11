package EsercizioAdapterSTRONZO;

public class LegacyUserSystem {
    public void addUser(String name){
        System.out.println("Da Sistema Legacy: Utente " + name + " aggiunto con successo.");
    }

    public void removeUser(String name){
        System.out.println("Da Sistema Legacy: Utente " + name + " rimosso con successo.");
    }

    public void searchUser(String name){
        System.out.println("Da Sistema Legacy: Ricerca utente " + name + " in corso.");
    }
}
