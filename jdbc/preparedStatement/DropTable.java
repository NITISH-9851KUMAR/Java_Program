package Java_Program.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DropTable {
    private static final String url="jdbc:oracle:thin:@localHost:1521:XE";
    private static final String userName="system";
    private static final String password="nitish";
    public static void main(String[] args) {
        Connection connection= null;
        PreparedStatement preparedStatement= null;

        try{
            connection= DriverManager.getConnection(url,userName,password);
            String query= "DROP TABLE ganga";
            preparedStatement= connection.prepareStatement(query); // compile query

            preparedStatement.executeUpdate(); // execute query
            System.out.println("Table Deleted Successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(preparedStatement!=null)  // close the PreparedStatement connection
                    preparedStatement.close();
                if(connection!=null)  // close the connection
                    connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
