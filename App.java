package org.example;
import java.sql.Connection;

public class App 
{

        public static void main(String[] args) {
            try (Connection conn = DbManager.connect()) {
                System.out.println("Connected using: " + conn.getMetaData().getURL());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
