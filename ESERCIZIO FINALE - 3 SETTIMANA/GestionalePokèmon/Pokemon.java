package GestionalePokèmon;

public class Pokemon {
    private String nome;
    private String tipo;
    private int livello;

    public Pokemon(String nome, String tipo, int livello) {
        this.nome = nome;
        this.tipo = tipo;
        this.livello = livello;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLivello() {
        return livello;
    }

     @Override
    public String toString() {
        return nome + " (" + tipo + ") \nLivello: " + livello;
    }
}