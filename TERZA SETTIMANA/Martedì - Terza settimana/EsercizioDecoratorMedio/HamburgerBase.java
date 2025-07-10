package EsercizioDecoratorMedio;

public class HamburgerBase implements Hamburger {
    //overridiamo i metodi dell'interfaccia per personalizzarli sul burger base

    @Override
    public String getDescrizione(){
        return "Hamburger di manzo da 200g, lattuga, patatine fritte";
    }

    @Override
    public double getPrezzo() {
        return 5.00;
    }
}
