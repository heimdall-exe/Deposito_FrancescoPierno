package com.example;
import java.sql.*;
import java.util.Scanner;

public class Esercizio1Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String DB_USER = "jaita";
    private static final String DB_PASSWORD = "jaita"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\nMAIN MENU");
                System.out.println("1. Mostra i 10 film più noleggiati (dal meno al più noleggiato)");
                System.out.println("2. Esci");
                System.out.print("Scelta: ");
                int scelta = sc.nextInt();

                switch (scelta) {
                    case 1:
                        mostraTop10Film(conn);
                        break;
                    case 2:
                        System.out.println("Uscita dal programma");
                        return;
                    default:
                        System.out.println("Scelta non valida.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void mostraTop10Film(Connection conn) {
        String query = 
            "SELECT f.title, COUNT(r.rental_id) AS num_noleggi " +
            "FROM rental r " +
            "JOIN inventory i ON r.inventory_id = i.inventory_id " +
            "JOIN film f ON i.film_id = f.film_id " +
            "GROUP BY f.film_id " +
            "ORDER BY num_noleggi ASC " +
            "LIMIT 10";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n TOP 10 Film più noleggiati (dal meno al più)");
            while (rs.next()) {
                String titolo = rs.getString("title");
                int noleggi = rs.getInt("num_noleggi");
                System.out.println(titolo + " - Numero di noleggi: " + noleggi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}