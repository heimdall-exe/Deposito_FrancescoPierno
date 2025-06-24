import java.util.Arrays;

public class ProvaStringhe {
    public static void main(String[] args) {
        String gennaroBullo = "Affrontami in una lotta Pokèmon!";
        System.out.println("La lunghezza è: " + gennaroBullo.length());

        String nome = "Gennaro ";
        String cognome = "Bullo";
        System.out.println(nome.concat(cognome));

        //String frase = "We are the so called \"Vikings"\"from the north"  //NIENTE MIRKO NON HO CAPITO LOL

        String stringhetta = "Prova special characters";
        String [] words = stringhetta.split("\\s")
        System.out.println(Arrays.toString(words));
    }
}
