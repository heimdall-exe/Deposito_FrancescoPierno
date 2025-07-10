package EsercizioDecoratorFacile;

public class MessaggioBase implements Messaggio {
    @Override
    public String getContenuto(){
        return "Questo è un messaggio semplice";
    }
}
