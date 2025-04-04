package Java_Program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class BasicCreateTable {
    static final  String url= "jdbc:oracle:thin:@localhost:1521:XE";
    static final String userName= "system";
    private static final String password= "nitish";
    public static void main(String[] args) {

        Connection connection= null; // Create the object of Connection interface

        Statement statement= null;  // create the object of Statement interface

        try{
            // Load the oracle driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the connection
            connection= DriverManager.getConnection(url, userName, password);

            // Create the statement for execute query
            statement= connection.createStatement();

            // Query for database
            String query= "CREATE TABLE JAVA_COURSE(" +
                    "Roll NUMBER(2),"+
                    "Name VARCHAR(20)," +
                    "Marks NUMBER(3),"+
                    "Grade VARCHAR(1))";

            // Execute sql query using statement
            boolean flag= statement.execute(query);
            // if query execute successfully it returns true  other false
            if(flag!=true) // if statement successfully execute the return false value
                // returns true when query has any row
                System.out.println("Table Created Successfully!");

            // Instead of statement.execute(query) // it return the boolean value
            // we can also use statement.executeUpdate() // but it returns the integer value

        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            e.printStackTrace();
        }finally{
          try{
              if(statement!= null)
                  statement.close(); // close statement
              if(connection!= null)
                  connection.close(); // close connection

          }catch(Exception e){
              System.out.println(e.getMessage());
              e.printStackTrace();
          }
        } // finally block close there

    }
}
