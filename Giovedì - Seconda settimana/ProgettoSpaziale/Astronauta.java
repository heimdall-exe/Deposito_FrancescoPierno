package ProgettoSpaziale;
import java.util.Random;

public class Astronauta {
    protected String nome;
    protected String email;
    protected float creditoOssigeno;
    protected int azioniCompletate = 0;

    public Astronauta(String nome, String email) {
        this.nome = nome;
        this.email = email;
        rigeneraOssigeno();
    }

    //randomizziamo la rigenerazione di ossigeno ad ogni login
    public void rigeneraOssigeno() {
        Random rand = new Random();
        this.creditoOssigeno = rand.nextFloat();
    }

    //classico metodo di stampa del cristiano
    public String stampaDettagli() {
        return "Nome: " + nome + "\nEmail: " + email + "\nOssigeno: " + creditoOssigeno;
    }

    // Metodo per interagire base, sovrascrivibile nelle sottoclassi
    public void interagisci(StazioneSpaziale stazione) {
        System.out.println("Questo astronauta non può interagire.");
    }
}
