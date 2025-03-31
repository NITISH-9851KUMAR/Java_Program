package Java_Program.jdbc;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class FetchData {
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

            String query= "SELECT * FROM bagmati";
            ResultSet rSet= statement.executeQuery(query);
            while(rSet.next()){
                String name= rSet.getString("name");
                int prn= rSet.getInt("prn");
                String grade= rSet.getString("grade");
                System.out.println("Name: "+name);
                System.out.println("PRN: "+prn);
                System.out.println("Grade: "+grade);
            }
        }catch(SQLException e){
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
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
