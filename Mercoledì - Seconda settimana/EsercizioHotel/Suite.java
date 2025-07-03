package EsercizioHotel;

public class Suite extends Camera {
    private String serviziExtra;

    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo);
        this.serviziExtra = serviziExtra;
    }

    //getter e setter di servizi extra (esclusivo di suite)
    public String getServiziExtra() {
        return serviziExtra;
    }

    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    //overridiamo i due metodi dei dettagli per aggiungere i servizi extra della suite
    @Override
    public void dettagli() {
        super.dettagli();
        System.out.println("Servizi Extra: " + serviziExtra);
    }

    @Override
    public void dettagli(boolean conPrezzo) {
        super.dettagli(conPrezzo);
        System.out.println("Servizi Extra: " + serviziExtra);
    }
}
