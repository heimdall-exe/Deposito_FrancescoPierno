package EsercizioBorsa;

public class InvestitorePrivato implements Investitore {
    String nome;

    public InvestitorePrivato(String nome){
        this.nome= nome;
    }

    //metodo di notifica personalizzato per il privato
    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Gentile privato " + nome + ", il nuovo valore dell'azione " + azione +" è di " + valore +"€");
    }
}
