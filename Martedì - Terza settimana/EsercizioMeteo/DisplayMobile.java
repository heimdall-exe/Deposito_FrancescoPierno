package EsercizioMeteo;

//display mobile
public class DisplayMobile implements Display {
    @Override
    public void aggiorna (float temperatura){
        System.out.println("Display Mobile: La temperatura aggiornata è di " + temperatura + "°C");
    }
}
