package ProgettoDelivery;

public class Drone extends VeicoloConsegna implements Tracciabile {
    public Drone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    //overridiamo consegna pacco per personalizzarlo nel caso del drone
    @Override
    public void consegnaPacco(String destinazione) {
        System.out.println("Drone con targa " + targa + " sta volando verso " + destinazione);
    }

    //e facciamo lo stesso con traccia consegna
    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("Tracciamento drone automatico ATTIVATO - Codice: " + codiceTracking);
    }
}
