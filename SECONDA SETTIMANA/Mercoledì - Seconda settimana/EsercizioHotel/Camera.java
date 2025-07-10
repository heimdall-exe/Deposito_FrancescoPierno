package EsercizioHotel;

public class Camera {
    int numero;
    float prezzo;
    public Camera(int numero, float prezzo){
        this.numero=numero;
        this.prezzo=prezzo;
    }

    //getter e setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    //il metodo che stampa i dettagli della camera senza parametri
    public void dettagli() {
        System.out.println("Camera numero: " + numero + "\nPrezzo: " + prezzo);
    }
    //e quello che lo stampa con il prezzo
    public void dettagli(boolean conPrezzo) {
        if (conPrezzo) {
            System.out.println("Camera numero: " + numero + "\nPrezzo: " + prezzo);
        } else {
            System.out.println("Camera numero: " + numero);
        }
    }
}