package EsercizioPirata;

public class Pirata extends Persona{

    public Pirata(String nome){
        super(nome);
    }

    @Override
    public void saluta(){
        System.out.println("ARRRRRR CORPO DI MILLE BALENE! SONO PROPRIO IO, " + nome.toUpperCase()+"! VUOI DELLE POLPETTE DI BALENA?!");
    }
}
