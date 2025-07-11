package GestionalePokèmon;
public class StrategyBaccaliegia implements StrategyBacche {
    
    @Override
    public void nutrire(Pokemon pokemon) {
        System.out.println("Hai dato una Baccaliegia a " + pokemon.getNome()  + ". Forza aumentata!");
    }
}