package org.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {

        public static void main(String[] args) {
            try (Connection conn = DbManager.connect()) {
                Statement stmt = conn.createStatement();

                // Student details
                String id = "12456";
                String name = "Elira Kola";
                int finalPoints = 77;

                // SQL insert
                String sql = "INSERT INTO student (Id, nameofthestudent, finalpoints) VALUES ('"
                        + id + "', '" + name + "', " + finalPoints + ")";
                stmt.executeUpdate(sql);

                System.out.println("\n✅ Student added successfully!" + "\n------");
                System.out.println("Student table: [" + id + "] " + name + " → " + finalPoints + " points");

            } catch (Exception e) {
                e.printStackTrace();
            }
            }
                    }






