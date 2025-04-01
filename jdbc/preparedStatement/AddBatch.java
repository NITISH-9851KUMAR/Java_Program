package Java_Program.jdbc.preparedStatement;

import java.sql.*;
import java.util.Scanner;

public class AddBatch {
    private static final String url="jdbc:oracle:thin:@localHost:1521:XE";
    private static final String userName="system";
    private static final String password="nitish";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Connection connection= null;
        PreparedStatement pStmt= null;

        try{
            connection= DriverManager.getConnection(url,userName,password);

            String name;
            String grade;
            int prn;

            String query= "INSERT INTO bagmati(name, prn, grade) VALUES(?, ?, ?)";

            pStmt= connection.prepareStatement(query); // Any statement create connection only one time
            while(true){
                System.out.print("Name: ");
                name= sc.next();
                System.out.print("PRN: ");
                prn= sc.nextInt();
                System.out.print("Grade: ");
                grade= sc.next();

                pStmt.setString(1, name);
                pStmt.setInt(2, prn);
                pStmt.setString(3, grade);

                pStmt.addBatch(); // Add data into batch

                System.out.print("Enter Choice(y/n): ");
                String choice= sc.next();
                if(choice.equalsIgnoreCase("N"))
                    break;
            }

            pStmt.executeBatch(); // Execute the Batch Query
            System.out.println("Data successfully Inserted Into Table");


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(pStmt!=null)  // close the PreparedStatement connection
                    pStmt.close();
                if(connection!=null)  // close the connection
                    connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
