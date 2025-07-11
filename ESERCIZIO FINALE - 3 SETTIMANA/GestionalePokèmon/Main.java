package GestionalePokèmon;

//in tal modo il main deve solo avviare la facade, et voilà!
public class Main {
    public static void main(String[] args) {
        CentroPokemonFacade facade = new CentroPokemonFacade();
        facade.avviaGestione();
    }
}
