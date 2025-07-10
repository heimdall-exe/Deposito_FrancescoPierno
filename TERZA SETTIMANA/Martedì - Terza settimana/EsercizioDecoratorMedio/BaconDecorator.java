package EsercizioDecoratorMedio;

public class BaconDecorator extends HamburgerDecorator { //gli faccio estendere la classe base che ho creato
    public BaconDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getDescrizione() {
        return hamburger.getDescrizione() + ", bacon"; //aggiungo il bacon alla descrizione
    }

    @Override
    public double getPrezzo() {
        return hamburger.getPrezzo() + 0.80; //odio il capitalismo, dannazione
    }
}