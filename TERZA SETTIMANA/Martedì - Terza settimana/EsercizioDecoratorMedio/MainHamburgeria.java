package EsercizioDecoratorMedio;

public class MainHamburgeria {
    public static void main(String[] args) {
        Hamburger base = new HamburgerBase();
        Hamburger conFormaggio = new FormaggioDecorator(base);
        Hamburger completo = new BaconDecorator(conFormaggio);

        System.out.println("Descrizione: " + completo.getDescrizione());
        System.out.println("Prezzo totale: " + completo.getPrezzo() + "€");
    }
}
