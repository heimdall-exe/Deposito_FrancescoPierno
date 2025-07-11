package GestionalePokèmon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentroPokemon {
    private Scanner scanner = new Scanner(System.in);
    private List<Allenatore> utenti = new ArrayList<>();  // lista di allenatori

    public void menu() {
        boolean running = true;
        while (running) {
            System.out.println("\n Benvenuto al Centro Pokèmon!\nCosa posso fare per te?");
            System.out.println("1. Registrazione allenatore");
            System.out.println("2. Login allenatore");
            System.out.println("3. Esci");
            System.out.print("Seleziona un’opzione: ");
            String scelta = scanner.nextLine();

            switch (scelta) {
                case "1":
                    registra();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    running = false;
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Opzione non valida, riprova.");
            }
        }
    }

    private void registra() {
        System.out.print("Inserisci nome allenatore: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci password: ");
        String password = scanner.nextLine();

        Allenatore nuovoAllenatore = new Allenatore(nome, password);
        utenti.add(nuovoAllenatore);
        System.out.println("Registrazione dell'Allenatore avvenuta con successo! Benvenuto nel mondo Pokèmon!");
    }

    private void login() {
        System.out.print("Nome allenatore: ");
        String nome = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Cerca l'allenatore nella lista
        Allenatore trovato = null;
        for (Allenatore a : utenti) {
            if (a.getNome().equals(nome)) {
                trovato = a;
                break;
            }
        }

        if (trovato != null && trovato.getPassword().equals(password)) {
            Sessione.getInstance().setAllenatore(trovato);
            System.out.println("Login effettuato! Benvenuto, allenatore " + trovato.getNome() + "!");
            mostraMenu();
        } else {
            System.out.println("Credenziali allenatore non valide.");
        }
    }

    private void mostraMenu() {
        Allenatore sessione = Sessione.getInstance().getAllenatore();
        while (sessione != null) {
            System.out.println("\n Menu Allenatore: " + sessione.getNome() + "\n Cosa vuoi fare oggi?");
            System.out.println("1. Aggiungi Pokémon");
            System.out.println("2. Visualizza i tuoi Pokémon");
            System.out.println("3. Dai una bacca.");
            System.out.println("4. Logout");
            System.out.print("Seleziona un’opzione: ");
            String scelta = scanner.nextLine();

            switch (scelta) {
                case "1":
                    aggiungiPokemon();
                    break;
                case "2":
                    visualizzaPokemon();
                    break;
                case "3":
                    daiUnaBacca();
                break;
                case "4":
                    logout();
                    sessione = Sessione.getInstance().getAllenatore();
                    break;
                default:
                    System.out.println("Opzione non valida, riprova.");
            }
        }
    }

    //METODO DI AGGIUNTA
    private void aggiungiPokemon() {
        System.out.print("Nome del Pokémon: ");
        String nomeP = scanner.nextLine();

        System.out.print("Tipo del Pokémon: ");
        String tipoP = scanner.nextLine();

        System.out.print("Livello del Pokémon: ");
        int livelloP = Integer.parseInt(scanner.nextLine());

        //integrazione con il Factory Method:
        Pokemon p = PokemonFactory.createPokemon(nomeP, tipoP, livelloP);

        Sessione.getInstance().getAllenatore().aggiungiPokemon(p);

        //Innesca la notifica all’allenatore
        Notificatore.getInstance().notify("Hai aggiunto " + p);
    }

    //METODO DI VISUALIZZAZIONE
    private void visualizzaPokemon() {
        Allenatore a = Sessione.getInstance().getAllenatore();
        System.out.println("\nI tuoi Pokémon:");
        if (a.getPokemons().isEmpty()) {
            System.out.println("Nessun Pokémon presente nel box.");
        } else {
            for (Pokemon p : a.getPokemons()) {
                System.out.println("- " + p);
            }
        }
    }

    //METODO PER DARE BACCHE
    private void daiUnaBacca() {
        Allenatore a = Sessione.getInstance().getAllenatore();
        List<Pokemon> lista = a.getPokemons();
        if (lista.isEmpty()) {
            System.out.println("Non hai Pokémon da nutrire.");
            return;
        }

        System.out.println("\nSeleziona il Pokémon a cui dare una bacca:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
        System.out.print("Numero Pokémon: ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;
        if (idx < 0 || idx >= lista.size()) {
            System.out.println("Selezione non valida.");
            return;
        }
        Pokemon scelto = lista.get(idx);

        System.out.println("\nPerfetto! Scegli la bacca che vuoi dargli:");
        System.out.println("1. Baccafrago");
        System.out.println("2. Baccaliegia");
        System.out.print("Opzione bacca scelta: ");
        String op = scanner.nextLine();

        StrategyBacche bacca;
        switch (op) {
            case "1":
                bacca = new StrategyBaccaFrago();
                break;
            case "2":
                bacca = new StrategyBaccaliegia();
                break;
            default:
                System.out.println("Mi dispiace, non abbiamo questa bacca.");
                return;
        }

        bacca.nutrire(scelto);
        Notificatore.getInstance().notify(
            "Hai dato una " + (bacca)+ " a " + scelto.getNome() + "!"
        );
    }

    private void logout() {
        Sessione.getInstance().logout();
        System.out.println("Logout eseguito con successo.");
    }
}