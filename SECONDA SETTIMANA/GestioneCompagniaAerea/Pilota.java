package GestioneCompagniaAerea;

public class Pilota {
    private String nome, numeroBrevetto;
    private int oreDiVolo;

    //INIZIALIZZAZIONE PILOTA//
    public Pilota(String nome, String numeroBrevetto, int oreDiVolo){
        this.nome=nome;
        this.numeroBrevetto=numeroBrevetto;
        this.oreDiVolo=oreDiVolo;
    }

    //-------------------------------GETTER & SETTER-------------------------------------//
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int oreDiVolo() {
        return oreDiVolo;
    }

    public void setoreDiVolo(int oreDiVolo) {
        if (oreDiVolo > 0) {
            this.oreDiVolo = oreDiVolo;
        }
    }

    public String getNumeroBrevetto() {
        return numeroBrevetto;
    }

    public void setNumeroBrevetto(String numeroBrevetto) {
        this.numeroBrevetto = numeroBrevetto;
    }

    //METODO PER STAMPARE LE INFO
    public void stampaInfoPilota() {
        System.out.println("Nome del pilota: " + nome + "\nNumero brevetto: " + numeroBrevetto + "\nOre di volo: " + oreDiVolo);
    }
}
