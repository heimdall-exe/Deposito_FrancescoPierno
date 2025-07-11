package EsercizioAdapterSTRONZO;
import java.util.ArrayList;
import java.util.List;

//-----DESIGN PATTERN FACADE-----
public class UserFacade {
    private final UserManagement userManagement;
    private final List <UserObserver> observersList = new ArrayList<>();

    public UserFacade(UserManagement userManagement){
        this.userManagement=userManagement;
    }


    //metodi per interagire con la lista e notificare
     public void addObserver(UserObserver observer) {
        observersList.add(observer);
    }

    public void removeObserver(UserObserver observer) {
        observersList.remove(observer);
    }

    private void notifyObservers(String event) {
        for (UserObserver observer : observersList) {
            observer.update(event);
        }
    }

    public void registerUser(String username) {
        userManagement.createUser(username);
        notifyObservers("Utente registrato: " + username);
    }

    public void unregisterUser(String username) {
        userManagement.deleteUser(username);
        notifyObservers("Utente cancellato: " + username);
    }

    public void searchUser(String username) {
        userManagement.findUser(username);
        notifyObservers("Utente cercato: " + username);
    }
}
