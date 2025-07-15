package GestionalePokèmon;

//FACADE
public class CentroPokemonFacade {
    private CentroPokemon centroPokemon;

    public CentroPokemonFacade() {
        this.centroPokemon = new CentroPokemon();
    }

//questa facade avvia tutto il gestionale di quel macello del centro pokemon
    public void avviaGestione() {
        centroPokemon.menu();
    }
}