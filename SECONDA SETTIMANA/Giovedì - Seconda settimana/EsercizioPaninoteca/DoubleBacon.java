package EsercizioPaninoteca;

public class DoubleBacon extends Hamburger {
    public DoubleBacon(){
        super("Double Bacon");
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione Double Bacon: bun tostato, doppio burger di manzo da 200g, doppio bacon, doppio cheddar, maionese.");
    }
}
