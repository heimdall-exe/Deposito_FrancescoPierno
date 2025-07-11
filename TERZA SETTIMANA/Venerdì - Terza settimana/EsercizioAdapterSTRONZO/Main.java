package EsercizioAdapterSTRONZO;

public class Main {

    public static void main(String[] args) {
        //Sistema legacy
        LegacyUserSystem legacySystem = new LegacyUserSystem();

        //Adapter
        UserManagement adapter = new UserManagementAdapter(legacySystem);

        //Facade
        UserFacade facade = new UserFacade(adapter);

        //Observer
        UserObserver logger = new ConcreteUserObserver("Logger1");
        facade.addObserver(logger);

        //Operazioni dimostrative
        facade.registerUser("Gennaro Bullo");
        facade.searchUser("Skibidi Frizzi");
        facade.unregisterUser("Mirko Campari");
    }
}
