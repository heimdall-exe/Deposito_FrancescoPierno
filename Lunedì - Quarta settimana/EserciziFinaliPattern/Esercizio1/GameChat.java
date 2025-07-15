//la classe concrete che implementa sia il mediator che l'observer(utente)
import java.util.*;


class GameChat implements ChatMediator, Observable {
    private List<ChatUser> users = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
        addObserver(user);  // ogni utente diventa anche osservatore
    }

    @Override
    public void sendMessage(String message, ChatUser sender) {
        System.out.println(sender.getName() + " ha inviato: " + message);
        notifyObservers(sender.getName() + ": " + message);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
