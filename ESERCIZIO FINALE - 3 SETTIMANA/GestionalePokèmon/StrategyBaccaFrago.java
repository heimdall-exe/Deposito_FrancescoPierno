package GestionalePokèmon;
public class StrategyBaccaFrago implements StrategyBacche {
    
    @Override
    public void nutrire(Pokemon pokemon) {
        System.out.println("Hai dato una BaccaFrago a " + pokemon.getNome()  + ". Felicità aumentata!");
    }
}