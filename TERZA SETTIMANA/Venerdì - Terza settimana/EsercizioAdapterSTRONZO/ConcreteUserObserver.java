package EsercizioAdapterSTRONZO;


//-----DESIGN PATTERN OBSERVER-----
public class ConcreteUserObserver implements UserObserver {
    private final String name;

    ConcreteUserObserver(String name){
        this.name=name;
    }

    @Override
    public void update(String event){
        System.out.println("Evento in atto su utente: " + name + ".");
    }
}
