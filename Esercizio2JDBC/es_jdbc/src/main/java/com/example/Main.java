package com.example;

import java.util.Scanner;

public class Main {
    
    //CONNESSIONE AL DB
    private static final String URL = "jdbc:mysql://localhost:3306/lista_pokemon";
    private static final String USER = "jaita";
    private static final String PASSWORD = "jaita";

    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        PokèmonUtils pokèmonUtils = new PokèmonUtils(URL, USER, PASSWORD);
        int scelta;

        //diamo il menu per usare il centro pokemon
        do {
            System.out.println("\nMENU CENTRO POKEMON");
            System.out.println("Benvenuto al Centro Pokèmon! Come posso aiutarti?");
            System.out.println("1. Inserisci nuovo Pokèmon");
            System.out.println("2. Visualizza tutti i Pokèmon");
            System.out.println("3. Aggiorna nome Pokèmon tramite ID");
            System.out.println("4. Cancella Pokèmon tramite ID");
            System.out.println("5. Cura la tua Squadra Pokèmon");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = intScanner.nextInt();

            switch (scelta) {
                //UTILIZZO CREATE
                case 1:
                    System.out.println("ID Pokèmon: ");
                    int id = intScanner.nextInt();
                    System.out.print("Nome Pokèmon: ");
                    String nome = stringScanner.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = stringScanner.nextLine();
                    pokèmonUtils.createPokemon(id, nome, tipo);
                    break;
                //UTILIZZO READ
                case 2:
                    pokèmonUtils.readPokemon();
                    break;
                //UTILIZZO UPDATE
                case 3:
                    System.out.print("Poke-ID da aggiornare: ");
                    int idUpdate = intScanner.nextInt();
                    System.out.print("Nome del nuovo Pokèmon: ");
                    String nuovoNome = stringScanner.nextLine();
                    System.out.println("Tipo del nuovo Pokèmon: ");
                    String nuovoTipo = stringScanner.nextLine();
                    pokèmonUtils.updatePokemon(idUpdate, nuovoNome, nuovoTipo);
                    break;
                //UTILIZZO DELETE
                case 4:
                    System.out.print("Poke-ID da cancellare: ");
                    int idDelete = intScanner.nextInt();
                    pokèmonUtils.deletePokemon(idDelete);
                    break;
                //UTILIZZO LA MIA BRILLANTE COMICITA' E IRONIA
                case 5:
                    System.out.println("""
                    ┌─────────────────────────────────────────────┐
                    │                                             │
                    │ I tuoi Pokémon sono stanchi?                │
                    │ Li cureremo in un attimo, per favore aspetta│
                    │                                             │
                    │ ♫ Pi pi pi pi piiii...                      │
                    │                                             │
                    │ I tuoi Pokémon sono tornati in piena forma! │
                    │ Speriamo di rivederti presto!               │
                    └─────────────────────────────────────────────┘
                    """);
                case 0:
                    System.out.println("Arrivederci dal Centro Pokèmon, torna a trovarci!");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);

        intScanner.close();
        stringScanner.close();
    }
}