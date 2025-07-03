package EsercizioPirata;

public class Main {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Gennaro Bullo");
        Persona p2 = new Persona("Gianfilippo Filiberti II De Astis");

        p1.saluta();
        p2.saluta();

        Pirata pirata = new Pirata("FRANCHINO DETTO IL MALAFFARE");
        pirata.saluta();
    }
}
