package Java_Program.jdbc.preparedStatement;

import java.sql.*;

public class CreateTable {
    static final String url= "jdbc:oracle:thin:@localhost:1521:xe";
    static final String userName= "system";
    static final String password= "nitish";
    public static void main(String[] args) {

        try{

            Connection connection= DriverManager.getConnection(url, userName, password);

//            Using Simple Statement
//            Statement statement= connection.createStatement();
//            String query= "CREATE TABLE ganga(name  VARCHAR(20), prn VARCHAR(12), grade VARCHAR(1))";
//            int rowAffected= statement.executeUpdate(query);
//            System.out.println("Table created successfully");

            // Using prepared Statement
            String query= "CREATE TABLE koshi(name  VARCHAR(20), prn VARCHAR(12), grade VARCHAR(1))";

            PreparedStatement pStatement= connection.prepareStatement(query);

            pStatement.execute();
            System.out.println("Table Created Successfully");

            // close the connection
            connection.close();
            pStatement.close();

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }

    }
}
