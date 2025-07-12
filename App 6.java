package org.example;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DbManager.connect()) {
            Statement stmt = conn.createStatement();

            // Student to update
            String id = "222";
            int newPoints = 45;

            // SQL update command
            String sql = "UPDATE student SET finalpoints = " + newPoints + " WHERE Id = '" + id + "'";
            int affected = stmt.executeUpdate(sql);

            if (affected > 0) {
                System.out.println("\nStudent's points updated successfully!!" + "\n-----");
                System.out.println("Student table: \n [" + id + "] → " + newPoints + " points");
            } else {
                System.out.println(" No student found with Id: [" + id + "]");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}







