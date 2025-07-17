package com.example;

import java.sql.*;
        
        public class App {
            public static void main(String[] args) {
                String url = "jdbc:mysql://localhost:3306/sakila"; // sostituire con il nome del DB
                String user = "jaita";       // utente del DB
                String password = "jaita";       // password del DB
        
                try (Connection conn = DriverManager.getConnection(url, user, password)) {
                    System.out.println("Connessione riuscita");
                } catch (SQLException e) {
                    System.out.println("Errore nella connessione");
                    e.printStackTrace();
                }
            }
        }