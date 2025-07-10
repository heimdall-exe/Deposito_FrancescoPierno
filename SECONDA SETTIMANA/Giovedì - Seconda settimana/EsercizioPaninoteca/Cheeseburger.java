package EsercizioPaninoteca;

public class Cheeseburger extends Hamburger {
    public Cheeseburger(){
        super("Cheeseburger");
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione Hamburger: bun tostato, burger di manzo 200g, cheddar, ketchup.");
    }
}
