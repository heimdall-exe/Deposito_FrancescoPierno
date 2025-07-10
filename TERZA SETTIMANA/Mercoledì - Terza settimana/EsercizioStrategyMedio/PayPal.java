package EsercizioStrategyMedio;

public class PayPal implements MetodoPagamento {
    @Override
    public void paga(double importo) {
        System.out.println("Hai sborsato " + importo + " dollaroni con PAYPAL! COGLIONE HAHAHAHAAHAH!");
    }
}