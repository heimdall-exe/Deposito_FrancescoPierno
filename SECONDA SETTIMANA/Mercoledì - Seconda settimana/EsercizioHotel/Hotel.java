package EsercizioHotel;
import java.util.ArrayList;

public class Hotel {
    String nome;
    private ArrayList<Camera> camere = new ArrayList<>();

    public Hotel(String nome){
        this.nome=nome;
        this.camere=new ArrayList<>();
    }

    //metodo per aggiungere camere alla lista
    public void aggiugiCamera(Camera camera){
        camere.add(camera);
    }

    //metodo per richiamare le camere nel gestore
    public ArrayList<Camera> getCamere() {
        return camere;
    }
    
    //restituisce quante suite ci sono nella lista di camere
    public static int contaSuite(ArrayList<Camera> lista){
        int count= 0;
        for (Camera c : lista) {
            if (c instanceof Suite) {
                count++;
            }
        }return count;
    }
}
