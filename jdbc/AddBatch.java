package Java_Program.jdbc;

import java.sql.*;
import java.util.Scanner;

public class AddBatch {
    private static final String url="jdbc:oracle:thin:@localHost:1521:XE";
    private static final String userName="system";
    private static final String password="nitish";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Connection connection= null;
        Statement statement= null;

        try{
            connection= DriverManager.getConnection(url,userName,password);
            statement= connection.createStatement();
            String name;
            char grade;
            int prn;

            while(true){
                System.out.print("Name: ");
                name= sc.next();
                System.out.print("PRN: ");
                prn= sc.nextInt();
                System.out.print("Grade: ");
                grade= sc.next().charAt(0);
                String query= String.format("INSERT INTO bagmati(name, prn, grade) VALUES('%s', %d, '%c')", name, prn, grade);
                statement.addBatch(query); // Add the value of query into batch
                System.out.print("Enter Choice(y/n): ");
                String choice= sc.next();
                if(choice.toUpperCase().equals("N"))
                    break;
            }

//             Finally execute Batch
            statement.executeBatch();
            System.out.println("Data Successfully Inserted into Table");

        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try{
                if(statement!=null)  // close the PreparedStatement connection
                    statement.close();
                if(connection!=null)  // close the connection
                    connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
