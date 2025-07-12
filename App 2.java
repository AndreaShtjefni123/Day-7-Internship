package org.example;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class App 
{

        public static void main(String[] args) {
            try (Connection conn = DbManager.connect()) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(
                        "SELECT table_name FROM information_schema.tables WHERE table_schema = 'public'"
                );

                while (rs.next()) {
                    System.out.println(" \uD83D\uDCC1 Table: " + rs.getString("table_name"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
