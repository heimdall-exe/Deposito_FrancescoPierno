package GestioneCompagniaAerea;
import GestioneCompagniaAerea.Pilota;
import GestioneCompagniaAerea.Aereo;
import java.util.ArrayList;

public class CompagniaAerea {
    private String nomeCompagnia;
    private ArrayList<Aereo> Flotta = new ArrayList<>();
    private ArrayList<Pilota> listaPiloti = new ArrayList<>();

    public CompagniaAerea(String nomeCompagnia){
        this.nomeCompagnia=nomeCompagnia;
    }

    //METODO AGGIUNGI AEREO ALLA FLOTTA
    public void aggiungiAllaFlotta(Aereo a){
        Flotta.add(a);
    }

    //METODO AGGIUNGI PILOTA ALL'EQUIPAGGIO
    public void aggiungiPilota(Pilota p){
        listaPiloti.add(p);
    }

    public void stampaInfo() {
        System.out.println("Compagnia Aerea: " + nomeCompagnia);
        
        System.out.println("Flotta:");
        for (Aereo a : Flotta) {
            a.stampaInfoAereo();
        }
        System.out.println("Piloti:");
        for (Pilota p : listaPiloti) {
            p.stampaInfoPilota();
        }
    }
}