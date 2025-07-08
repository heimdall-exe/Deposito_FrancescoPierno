package EsercizioBorsa;

public class InvestitoreBancario implements Investitore {
    String banca;

    public InvestitoreBancario(String banca){
        this.banca= banca;
    }

    //metodo di notifica personalizzato per il privato
    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Gentile Istituto " + banca + ", il nuovo valore dell'azione " + azione +" è di " + valore +"€");
    }
}