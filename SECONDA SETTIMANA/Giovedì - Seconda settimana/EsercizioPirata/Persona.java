package EsercizioPirata;

public class Persona {
   protected String nome;

   public Persona(String nome){
        this.nome=nome;
   }

   public void saluta(){
    System.out.println("Ciao bello, sono " + nome + "!");
   }
}
