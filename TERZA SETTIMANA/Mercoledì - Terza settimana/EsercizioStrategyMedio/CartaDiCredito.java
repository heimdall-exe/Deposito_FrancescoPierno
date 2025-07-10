package EsercizioStrategyMedio;

public class CartaDiCredito implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Hai sborsato " + importo + " dollaroni con CARTA DI CREDITO! IMBECILLE HAHAHAHAHAHAHAAHA!");
    }
}