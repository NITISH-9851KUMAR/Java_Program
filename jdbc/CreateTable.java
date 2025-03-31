package Java_Program.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLSyntaxErrorException;
public class CreateTable {
    static String url= "jdbc:oracle:thin:@localhost:1521:XE";
    static String userName= "system";
    static String password= "nitish";
    public static void main(String[] args) {

        Connection connection= null;
        Statement statement;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();

            String query = "CREATE TABLE bagmati(" +
                    "name VARCHAR(20)," +
                    "prn NUMBER(12)," +
                    "grade VARCHAR(1))";

            int rowAffected = statement.executeUpdate(query);
            System.out.println("Table Created Successfully!");

        }catch(ClassNotFoundException e){ // For Driver
            System.out.println("JDBC Driver Not Found!");
            e.printStackTrace();
        }catch(SQLSyntaxErrorException e){ // For sql Syntax
            System.err.println("SQL Syntax Error! Check your query.");
            e.printStackTrace();
            System.out.println(e);
        } catch (SQLException e) { // For databse connection
            System.out.println("Database can't connect!");
            e.printStackTrace();
        }
        finally {
            try{
                if(connection!=null){
                    connection.close();
                    System.out.println("Connection Terminated!");
                }
            }catch(SQLException e1){
                e1.printStackTrace();
            }
        }


    }
}
