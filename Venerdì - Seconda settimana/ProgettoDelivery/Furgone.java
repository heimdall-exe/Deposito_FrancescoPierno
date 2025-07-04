package ProgettoDelivery;

public class Furgone extends VeicoloConsegna implements Tracciabile {
    public Furgone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    //overridiamo consegna pacco per personalizzarlo con il furgone
     @Override
    public void consegnaPacco(String destinazione) {
        System.out.println("Furgone con targa " + targa + " sta consegnando via strada a " + destinazione);
    }

    //e facciamo la stessa cosa per il tracciamento della consegna
    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("Tracciamento furgone ATTIVATO - Codice: " + codiceTracking);
    }
}
