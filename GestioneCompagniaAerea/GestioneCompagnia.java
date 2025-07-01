package GestioneCompagniaAerea;
import GestioneCompagniaAerea.Pilota;
import GestioneCompagniaAerea.Aereo;
import GestioneCompagniaAerea.CompagniaAerea;

public class GestioneCompagnia {
    public static void main(String[] args) {
        CompagniaAerea laNostraCompagnia = new CompagniaAerea("Gli Scappati di Casa");

        //CREIAMO AEREI
        Aereo aereo1 = new Aereo("Skibidi Plane", 69, "12345");
        Aereo aereo2 = new Aereo("Aereo Serietà Gigante Super Figo", 12000, "67890");

        //CREIAMO PILOTI
        Pilota pilota1 = new Pilota("Gennaro Bullo", "696969", 200000000);
        Pilota pilota2 = new Pilota("Pippo Pluto", "101010", 69);

        //LI AGGIUNGIAMO ALLE RISPETTIVE LISTE
        laNostraCompagnia.aggiungiAllaFlotta(aereo1);
        laNostraCompagnia.aggiungiAllaFlotta(aereo2);
        
        laNostraCompagnia.aggiungiPilota(pilota1);
        laNostraCompagnia.aggiungiPilota(pilota2);
        
        //E DAJE TUTTA DE STAMPA
        laNostraCompagnia.stampaInfo();
    }
}
