package EsercizioPaninoteca;

public class Hamburger {
    String nomePanino;

    public Hamburger(String nomePanino){
        this.nomePanino=nomePanino;
    }

    public void prepara(){
        System.out.println("Preparazione Hamburger: bun tostato, burger di manzo 200g, lattuga, pomodoro.");
    }

    public String getNomePanino(){
        return nomePanino;
    }
}

