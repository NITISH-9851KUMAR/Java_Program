package Java_Program.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTableData {
    static final String url= "jdbc:oracle:thin:@localhost:1521:XE";
    static final String userName= "system";
    static final String password= "nitish";
    public static void main(String[] args) {
        Connection connection= null;
        PreparedStatement preparedStatement= null;

        try{
            connection= DriverManager.getConnection(url,userName,password);
            String query= "DELETE FROM bagmati WHERE prn= ?";
            preparedStatement= connection.prepareStatement(query); // compile query

            preparedStatement.setInt(1,31017);
            int rowAffected= preparedStatement.executeUpdate();
            if(rowAffected>0) System.out.println("Data Deleted Successfully!");


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
