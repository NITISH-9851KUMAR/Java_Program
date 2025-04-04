package Java_Program.jdbc;

import java.sql.*;

public class CountRow {
    static String url= "jdbc:oracle:thin:@localhost:1521:XE";
    static String userName= "system";
    static String password= "nitish";
    public static void main(String[] args) {


            Connection connection= null;
            Statement statement= null;
            PreparedStatement pStmt= null;
            String query;
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");

                connection= DriverManager.getConnection(url, userName, password);

//                query= "SELECT * FROM Java_Course";
//                statement= connection.createStatement();
//                ResultSet rset= statement.executeQuery(query);
//                System.out.println("*-----* Table Data Before Insert *-----*");
//                while(rset.next()){
//                    System.out.print("\nRoll Number: "+rset.getInt("roll")+
//                            "\t\tName: "+rset.getString("name")+
//                            "\t\tMarks: "+rset.getInt("marks")+
//                            "\t\tGrade: "+rset.getString("grade"));
//                }
//
//                System.out.print("\n\nData Insert Into Table");
//                query= "INSERT INTO JAVA_COURSE(roll, name, marks, grade) VALUES(?, ?, ?,?)";
//                pStmt= connection.prepareStatement(query);
//
//                while(true){
//                    System.out.print("\nEnter Roll Number: ");
//                    int roll= new java.util.Scanner(System.in).nextInt();
//
//                    System.out.print("Name: ");
//                    String name= new java.util.Scanner(System.in).next();
//
//                    System.out.print("marks: ");
//                    int marks= new java.util.Scanner(System.in).nextInt();
//
//                    System.out.print("Grade: ");
//                    String grade= new java.util.Scanner(System.in).next();
//
//                    pStmt.setInt(1, roll); // set the Roll Number
//                    pStmt.setString(2, name);
//                    pStmt.setInt(3, marks);
//                    pStmt.setString(4, grade);
//
//                    pStmt.addBatch();
//                    System.out.println("For break press 17");
//                    int flag= new java.util.Scanner(System.in).nextInt();
//                    if(flag==17) break;
//                }
//
//                // finally execute Batch for Insert data Into Table
//                pStmt.executeBatch();
//                System.out.println("Data Inserted Successfully into table!");
//
//                query= "SELECT * FROM Java_Course";
//                statement= connection.createStatement();
//                rset= statement.executeQuery(query);
//                System.out.print("\n*-----* Table Data After Inserted *-----*");
//                while(rset.next()){
//                    System.out.print("\nRoll Number: "+rset.getInt("roll")+
//                            "\t\tName: "+rset.getString("name")+
//                            "\t\tMarks: "+rset.getInt("marks")+
//                            "\t\tGrade: "+rset.getString("grade"));
//                }

//                Calculating the number of rows present in the database
                query= "SELECT COUNT(*) FROM Java_Course";
//                rset= pStmt.executeQuery(query);
//                if (rset.next()) {
//                    System.out.println("Total Number of Rows: "+rset.getInt("roll"));
//                }

            }catch(ClassNotFoundException e){
                System.out.println("Class Not Found!");
                e.printStackTrace();
            }catch(SQLException e){
                e.printStackTrace();
            }
            finally  {
                try{
                    if(connection!=null)
                        connection.close();

                    if(statement!= null)
                        statement.close();

                    if(pStmt!= null)
                        statement.close();

                }catch(SQLException e){}
            }
    }
}
