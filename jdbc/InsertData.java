package Java_Program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class InsertData {
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

            String name= "priya";
            char grade= 'A';
            int prn= 31017;
            String query= String.format("INSERT INTO bagmati(name, prn, grade) VALUES('%s', %d, '%c')",name, prn, grade);
            int rowAffected= statement.executeUpdate(query);
            if(rowAffected>0)
                System.out.println("Data Insert Into Table");


        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found!");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Cannot connect to the database");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally  {
            try{
                if(connection!=null)
                    connection.close();
                statement.close();

            }catch(SQLException e){}
        }

    }
}
