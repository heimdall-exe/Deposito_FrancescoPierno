package EsercizioBorsa;

public class Main {
    public static void main(String[] args) {
        //creo le liste delle due agenzie
        AgenziaBorsa agenzia1 = AgenziaBorsa.getIstanza();
        AgenziaBorsa agenzia2 = AgenziaBorsa.getIstanza();

        // Verifico che l'istanza sia la stessa
        if (agenzia1 == agenzia2) {
            System.out.println("Daje tutta, AgenziaBorsa è un Singleton");
        }

        // Metodo di registrazione per gli investitori
        Investitore gennaroBullo = new InvestitorePrivato("Gennaro Bullo");
        Investitore unicredit = new InvestitoreBancario("Unicredit");

        agenzia1.aggiungiInvestitore(gennaroBullo);
        agenzia2.aggiungiInvestitore(unicredit);            // Anche questa è sempre la stessa istanza (spero, se ho fatto bene)

        agenzia1.aggiornaValoreAzioni("Nome-generico-azione-perchè-non-so-come-funziona-il-mercato-azionario", 1000.50);
    }
}