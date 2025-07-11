package GestionalePokèmon;

//FACTORY METHOD
public class PokemonFactory {
    public static Pokemon createPokemon(String nome, String tipo, int livello) {
        return new Pokemon(nome, tipo, livello);
    }
}