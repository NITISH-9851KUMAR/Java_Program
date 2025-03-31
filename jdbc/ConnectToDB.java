package Java_Program.jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class ConnectToDB {
    final private static String url= "jdbc:oracle:thin:@localhost:1521:XE";
    final private static  String userName= "system";
    final private static String password= "nitish";
    public static void main(String[] args) {

        Connection connection= null;
        try{
            // load the driver of Oracle database it can vary for different database
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection= DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection Established");
        }catch (ClassNotFoundException e){ // Exception for JDBC Driver
            System.out.println("JDBC Driver not found.");
            System.out.println("Cannot connect to database server");
            e.printStackTrace();
        }catch(SQLException e){ //
            System.out.println("Database can't connect!");
            e.printStackTrace();
        }finally {
            try {
                if(connection!=null) {
                    connection.close();
                    System.out.println("Database Connection Terminated");
                }
            }catch (Exception e1){
                System.err.println("Error while closing the connection.");
                e1.printStackTrace();
            }
        }// finally

    }
}
