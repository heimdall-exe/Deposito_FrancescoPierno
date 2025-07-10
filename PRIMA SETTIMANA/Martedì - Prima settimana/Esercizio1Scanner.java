import java.util.Scanner;

public class Esercizio1Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa:");
        String stringa = sc.nextLine();

        System.out.println("Inserisci un numero intero:");
        int numeroIntero = sc.nextInt();

        System.out.println("Inserisci un numero con la virgola:");
        double numeroDouble = sc.nextDouble();

        System.out.println("I dati inseriti sono: " + stringa + ", " + numeroIntero + " e " + numeroDouble + ".");

        
        System.out.println("Ora invertiamo int e double");

        System.out.println("Inserisci un altro numero con la virgola:");
        double numeroDouble2 = sc.nextDouble();

        System.out.println("Inserisci anche un altro numero con intero:");
        int numeroIntero2 = sc.nextInt();

        numeroDouble2 = numeroIntero2;

        System.out.println("Ordine invertito: " + numeroDouble2 + " e " + numeroIntero2);

    }
    public void printLenght(){
            String gennaroBullo = "Sono proprio io, Gennaro Bullo!";
            int lenght = gennaroBullo.length();
            System.out.println("La lunghezza della frase è: " + lenght);

            String vuota = " ";
            int lenghtVuota = vuota.length();
            System.out.println("La lunghezza della frase vuota è: " + lenghtVuota);
        }
}
