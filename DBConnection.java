
package registation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
  Connection con;
  PreparedStatement statement;

    public final void dbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentcoursereg", "root", "");
            System.out.println("connecterd succefully");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(registation.DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        dbConnection.dbConnect(); // Call the method to establish the database connection
    }
}
