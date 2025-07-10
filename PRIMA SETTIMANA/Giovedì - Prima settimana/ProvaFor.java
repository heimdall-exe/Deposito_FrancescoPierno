import java.util.Scanner;

public class ProvaFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = sc.nextInt();

        System.out.println("Tabellina del " + numero + ": ");
        for(int i = 1; i <=10; i++){
                System.out.println(numero + "X" + i + "=" + (numero*i));
        }
    }
}