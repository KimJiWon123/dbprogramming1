/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class LAB11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM student"
                    + "WHERE studentID = '111111'";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
