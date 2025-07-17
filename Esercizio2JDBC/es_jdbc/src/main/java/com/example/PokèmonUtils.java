package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PokèmonUtils {
    private String url, user, password;

    public PokèmonUtils(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    //CREATE
    public void createPokemon(int id, String nome, String tipo){
        String sql = "INSERT INTO pokemon (id, nome, tipo) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, tipo);
            stmt.executeUpdate();
            System.out.println("Pokèmon inserito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //READ
    public void readPokemon(){
        String sql = "SELECT * FROM pokemon;";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Nome Pokèmon: " + rs.getString("nome") +
                                   ", Tipo Pokèmon: " + rs.getString("tipo"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //UPDATE
    public void updatePokemon(int id, String nuovoNome, String nuovoTipo){
        String sql = "UPDATE pokemon SET nome = ?, tipo = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nuovoNome);
            stmt.setString(2, nuovoTipo);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Pokèmon aggiornato.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //DELETE
    void deletePokemon(int id){
        String sql = "DELETE FROM pokemon WHERE id = ?";
         try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Pokèmon eliminato.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
