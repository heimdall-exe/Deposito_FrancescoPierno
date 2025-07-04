package ProgettoDelivery;

public abstract class VeicoloConsegna {
    protected String targa;
    protected float caricoMassimo;

    public VeicoloConsegna(String targa, float caricoMassimo) {
        this.targa = targa;
        this.caricoMassimo = caricoMassimo;
    }

    //metodo astratto vuoto
    public abstract void consegnaPacco(String destinazione);

    public void stampaInfo() {
        System.out.println("Targa: " + targa + "\nCarico massimo: " + caricoMassimo + "kg");
    }
}
