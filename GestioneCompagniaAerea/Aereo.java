package GestioneCompagniaAerea;

public class Aereo {
    private String modello;
    private int numeroPosti;
    private String codice;

    //INIZIALIZZAZIONE AEREO//
    public Aereo(String modello, int numeroPosti, String codice){
        this.modello = modello;
        this.codice=codice;
        this.numeroPosti=numeroPosti;
    }

    //-------------------------------GETTER & SETTER-------------------------------------//
    public String getModello(){
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        if (numeroPosti > 0) {
            this.numeroPosti = numeroPosti;
        }
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    //METODO PER STAMPARE LE INFO
    public void stampaInfoAereo() {
        System.out.println("Aereo: " + modello + "\nPosti: " + numeroPosti + "\nCodice: " + codice);
    }
}
