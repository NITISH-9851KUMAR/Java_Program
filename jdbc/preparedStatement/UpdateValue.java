package Java_Program.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateValue {
    private static final String url="jdbc:oracle:thin:@localHost:1521:XE";
    private static final String userName="system";
    private static final String password="nitish";
    public static void main(String[] args) {
        Connection connection= null;
        PreparedStatement preparedStatement= null;

        try{
            connection= DriverManager.getConnection(url,userName,password);

            String query= "UPDATE ganga SET name= ? WHERE prn= ?";
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1,"Ankush Kumar");
            preparedStatement.setString(2,"220205131004");

            int rowAffected= preparedStatement.executeUpdate();
            if(rowAffected>0) System.out.println("Table data updated Successfully");

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
