package EsercizioAdapterSTRONZO;

//-----PATTERN ADAPTER-----
public class UserManagementAdapter implements UserManagement {
    private final LegacyUserSystem sistemaLegacy;

    public UserManagementAdapter(LegacyUserSystem sistemaLegacy){
        this.sistemaLegacy=sistemaLegacy;
    }

    //overrido i metodi per usarli con l'adattatore
    @Override
    public void createUser (String username){
        sistemaLegacy.addUser(username);
    }

    @Override
    public void deleteUser (String username){
        sistemaLegacy.removeUser(username);
    }

    @Override
    public void findUser (String username){
        sistemaLegacy.searchUser(username);
    }
}
