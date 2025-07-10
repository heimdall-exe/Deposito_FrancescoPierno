package EsercizioHotel;
import EsercizioHotel.*;

public class GestoreHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel dell'Odio e della Frustrazione");

        //aggiungo due camere normali
        Camera c1 = new Camera(104, 10.0f);
        Camera c2 = new Camera(69, 990.5f);

        //aggiungo due Suite
        Suite s1 = new Suite(990, 150.0f, "Pugni in faccia, schiaffi gratis");
        Suite s2 = new Suite(100, 180.0f, "Testate in bocca, Insulti");

        hotel.aggiugiCamera(c1);
        hotel.aggiugiCamera(c2);
        hotel.aggiugiCamera(s1);
        hotel.aggiugiCamera(s2);

        // Uso overload per i metodi dettagli() in entrambe le forme
        System.out.println("\nDettagli Camere");
        for (Camera camera : hotel.getCamere()) {
            camera.dettagli();                          // quello senza parametro
            camera.dettagli(true);            // quello con parametro true
            System.out.println();
        }
    }
}
