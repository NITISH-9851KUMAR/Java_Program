package Java_Program.jdbc;

import java.sql.*;

public class UpdateTable {
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

            String query= "UPDATE bagmati SET grade= 'C' WHERE prn= 31017";
            int rowAffected= statement.executeUpdate(query);
            if(rowAffected>0) System.out.println("Update data into table");

        }catch(SQLException e){
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                connection.close();
                statement.close();
            }catch ( SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
