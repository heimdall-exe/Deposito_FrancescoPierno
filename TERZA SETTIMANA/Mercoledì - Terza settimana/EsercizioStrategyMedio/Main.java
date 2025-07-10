package EsercizioStrategyMedio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PagamentoContext context = new PagamentoContext();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey dollaro con le gambe, seleziona come vuoi pagare");
        System.out.println("1. Carta di Credito");
        System.out.println("2. PayPal");
        System.out.print("Scelta: ");
        int scelta = sc.nextInt();

        System.out.print("Dimmi pure quanto vuoi sborsare, canaglia: ");
        double importo = sc.nextDouble();

        switch (scelta) {
            case 1:
                context.setMetodo(new CartaDiCredito());
                break;
            case 2:
                context.setMetodo(new PayPal());
                break;
            default:
                System.out.println("CHE CAZZO SCRIVI LESTOFANTE? METODO NON VALIDO, VUOI PER CASO PROVARE A FOTTERMI?!");
                return;
        }

        context.eseguiPagamento(importo);
    }
}