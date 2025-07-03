package EsercizioPaninoteca;

public class VegBurger extends Hamburger {
    public VegBurger(){
        super("Vegan Burger");
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione Veg Burger: bun integrale tostato, burger vegetale 200g, lattuga, pomodoro.");
    }
}
