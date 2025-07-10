package EsercizioDecoratorMedio;

public class FormaggioDecorator extends HamburgerDecorator { //gli faccio estendere la classe base che ho creato
    public FormaggioDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getDescrizione() {
        return hamburger.getDescrizione() + ", formaggio"; //aggiungo il formaggio alla descrizione
    }

    @Override
    public double getPrezzo() {
        return hamburger.getPrezzo() + 0.50; //e lo faccio costare di più perchè esiste il capitalismo ('tacci loro)
    }
}