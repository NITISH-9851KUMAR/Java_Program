package Java_Program.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    static final String url= "jdbc:oracle:thin:@localhost:1521:xe";
    static final String userName= "system";
    static final String password= "nitish";
    public static void main(String[] args) {

        Connection connection= null;
        PreparedStatement pStatement= null;

        try{
            connection= DriverManager.getConnection(url, userName, password);

            String query= "INSERT INTO ganga(name, prn, grade) VALUES(?, ?, ?)";
            pStatement= connection.prepareStatement(query);

            pStatement.setString(1, "Akash Kumar");
            pStatement.setString(2, "220205131004");
            pStatement.setString(3, "A");

            int rowAffected= pStatement.executeUpdate();
            if(rowAffected>0) System.out.println("Successfully data Inserted into Table");

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }finally {
            try{
                if(pStatement!=null)  // close the PreparedStatement connection
                    pStatement.close();
                if(connection!=null)  // close the connection
                    connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
