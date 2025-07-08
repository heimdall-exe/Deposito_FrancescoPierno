package EsercizioMeteo;

//display console
public class DisplayConsole implements Display {
    @Override
    public void aggiorna (float temperatura){
        System.out.println("Display Console: La temperatura aggiornata è di " + temperatura + "°C");
    }
}
