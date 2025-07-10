import java.util.Scanner;

public class EsempioEccezioni3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Inserire un numero");
            int input = scanner.nextInt();
            System.out.println("Inserito: " + input);
        } catch (Exception e) {
                    }
    }
}
