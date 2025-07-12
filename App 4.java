package org.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {

        public static void main(String[] args) {
            try (Connection conn = DbManager.connect()) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE finalpoints > 10");

                while (rs.next()) {
                    String id = rs.getString("Id");
                    String nameofthestudent = rs.getString("nameofthestudent");

                    int finalpoints = rs.getInt("finalpoints");

                    System.out.println("Student table: \n " +"["+ id+"]" +" "+ nameofthestudent  + " → " + finalpoints + " points");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
                    }
                }





