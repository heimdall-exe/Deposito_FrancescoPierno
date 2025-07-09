package EsercizioStrategyMedio;

public class PagamentoContext {
    private MetodoPagamento metodo;

    public void setMetodo(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public void eseguiPagamento(double importo) {
        if (metodo == null) {
            System.out.println("Dannata canaglia! Seleziona un metodo di pagamento per farti spillare il danaro!");
            return;
        }
        metodo.paga(importo);
    }
}