package org.example;

import java.sql.*;

public class App {

        public static void main(String[] args) throws SQLException {
            try (Connection conn = DbManager.connect()) {
                Statement stmt = conn.createStatement();

                // ID of the student to delete
                String id = "453";

                // SQL delete command
                String sql = "DELETE FROM student WHERE Id = '" + id + "'";
                int affected = stmt.executeUpdate(sql);

                if (affected > 0) {
                    System.out.println("Student deleted successfully!!");
                    System.out.println("Deleted student with Id: [" + id + "]");
                } else {
                    System.out.println(" No student found with Id: [" + id + "]");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            }
            }







