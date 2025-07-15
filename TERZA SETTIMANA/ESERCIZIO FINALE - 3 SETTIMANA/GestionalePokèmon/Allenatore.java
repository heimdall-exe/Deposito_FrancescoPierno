package GestionalePokèmon;

import java.util.ArrayList;
import java.util.List;

public class Allenatore implements Osservatore {
    private String nome;
    private String password;
    private List<Pokemon> pokemonTeam = new ArrayList<>();

    public Allenatore(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public void aggiungiPokemon(Pokemon p) {
        pokemonTeam.add(p);
    }

    public List<Pokemon> getPokemons() {
        return pokemonTeam;
    }

    @Override
    public void riceviNotifica(String messaggio) {
        System.out.println("[Notifica] " + messaggio);
    }
}