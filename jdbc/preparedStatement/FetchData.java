package Java_Program.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class FetchData {
    static final String url= "jdbc:oracle:thin:@localhost:1521:xe";
    static final String userName= "system";
    static final String password= "nitish";
    public static void main(String[] args) {
        Connection connection= null;
        PreparedStatement pStatement= null;

        try{
            connection= DriverManager.getConnection(url, userName, password);

            String query= "SELECT * FROM ganga";
            pStatement= connection.prepareStatement(query);


//            pStatement.execute();
//            ResultSet resultSet= pStatement.getResultSet();

//            Instead of Two line
            ResultSet resultSet= pStatement.executeQuery();
//             all Table data stored in resultSet Object

            while (resultSet.next()) {
//                 Also we can give the column index
//                String name= resultSet.getString(2); 2 is index of column which is prn

//                also give the column name
                String name= resultSet.getString("name");

                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("prn"));
                System.out.println(resultSet.getString("grade"));
            }

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
