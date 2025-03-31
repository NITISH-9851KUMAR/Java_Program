package Java_Program.jdbc;

import java.sql.*;
import java.sql.ResultSet;

public class DeleteTable {
    static String url= "jdbc:oracle:thin:@localhost:1521:XE";
    static String userName= "system";
    static String password= "nitish";
    public static void main(String[] args) {

        Connection connection= null;
        Statement statement= null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection= DriverManager.getConnection(url, userName, password);
            statement= connection.createStatement();

            String query = "DROP TABLE Student1";
            boolean result = statement.execute(query);
//             int rowAffected= statement.executeUpdate(query);

            if(!result){
                System.out.println("Table dropped successfully");
            } else {
                System.out.println("Table drop failed");
            }

        }catch(SQLException e){
            System.out.println("SQLState: "+ e.getSQLState());
            System.out.println("SQLError Code: "+ e.getErrorCode());
            System.out.println("Message: "+e.getMessage());
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            try{
                connection.close();
                statement.close();
            }catch ( SQLException e){
                e.printStackTrace();
            }
        }

    }
}
