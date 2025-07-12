package org.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

public class App 
{

        public static void main(String[] args) {
            try (Connection conn = DbManager.connect()) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM kursi");

                while (rs.next()) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("nameofthecourse");
                        String duration = rs.getString("duration");
                        Date created = rs.getDate("createdate");
                        Date updated = rs.getDate("updatedate");
                        String language = rs.getString("programminglanguage");

                        System.out.println("Kursi table: \n" + "[" + id + "]"  + name
                                + " -> Duration: " + duration
                                + " -> Created: " + created
                                + " -> Updated: " + updated
                                + " -> Language: " + language+ "\n--------");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
