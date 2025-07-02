package EsercizioAsiloPokèmon;
import java.util.*;

public class AsiloPokemon {
    public static void main(String[] args) {
        Scanner pokeScanner = new Scanner(System.in);

        ArrayList<Pokemon> listaDeiBidoof = new ArrayList<>();
        ArrayList<Pokemon> listaDeiTurtwig = new ArrayList<>();
        ArrayList<Pokemon> listaDiSquirtle = new ArrayList<>();
        
        //INSERIMENTO BIDOOF
        System.out.print("Quanti Bidoof vuoi inserire? ");
        int numeroBidoof = pokeScanner.nextInt();
        pokeScanner.nextLine();

        for (int i = 0; i < numeroBidoof; i++) {
            System.out.print("Nome del Bidoof: ");
            String nome = pokeScanner.nextLine();

            String tipo = "Normale";

            System.out.print("Età Bidoof: ");
            int eta = pokeScanner.nextInt();
            pokeScanner.nextLine();

            listaDeiBidoof.add(new Bidoof(nome, tipo, eta));
        }

        //INSERIMENTO TURTWIG
        System.out.print("Quanti Turtwig vuoi inserire? ");
        int numeroTurtwig = pokeScanner.nextInt();
        pokeScanner.nextLine();

        for (int i = 0; i < numeroTurtwig; i++) {
            System.out.print("Nome del Turtwig: ");
            String nome = pokeScanner.nextLine();

            String tipo = "Erba";

            System.out.print("Età Turtwig: ");
            int eta = pokeScanner.nextInt();
            pokeScanner.nextLine();

            listaDeiTurtwig.add(new Turtwig(nome, tipo, eta));
        }

        //INSERIMENTO SQUIRTLE
        System.out.print("Quanti Squirtle vuoi inserire? ");
        int numeroSquirtle = pokeScanner.nextInt();
        pokeScanner.nextLine();

        for (int i = 0; i < numeroSquirtle; i++) {
            System.out.print("Nome del Squirtle: ");
            String nome = pokeScanner.nextLine();

            String tipo = "Acqua";

            System.out.print("Età Squirtle: ");
            int eta = pokeScanner.nextInt();
            pokeScanner.nextLine();

            listaDiSquirtle.add(new Squirtle(nome, tipo, eta));
        }


         // Un array di tutti i Pokèmon
        List<Pokemon> tuttiPokemon = new ArrayList<>();
        tuttiPokemon.addAll(listaDeiBidoof);
        tuttiPokemon.addAll(listaDeiTurtwig);
        tuttiPokemon.addAll(listaDiSquirtle);

        //GOTTA PRINT EM' ALL!
        System.out.println("\nPokèmon presenti nell'asilo: ");
        for (Pokemon a : tuttiPokemon) {
            a.stampaPokeInfo();
            System.out.println();
        }

        pokeScanner.close();
    }
}
