package Java_Program.jdbc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;
public class SwingExample extends JFrame implements ActionListener {

    static String url= "jdbc:oracle:thin:@localhost:1521:XE";
    static String userName= "system";
    static String password= "nitish";
    JTextField id;
    JTextField name;
    JButton add;
    JButton add_new;
    JPanel panel;
    static ResultSet res;
    static Connection conn;
    static Statement stmt;

    public SwingExample(){
        super("JDBC base on DS....");
        Container cntnr= getContentPane();
        cntnr.setLayout(new GridLayout(3,2));
        id= new JTextField(20);
        name= new JTextField(30);
        add= new JButton("INSERT");
        panel= new JPanel();
        cntnr.add(new JLabel("Employee ID"));
        cntnr.add(id);
        cntnr.add(new JLabel("Employee Name"));
        cntnr.add(name);
        cntnr.add(panel);
        panel.add(add);
        add.addActionListener(this);
        pack();
        setVisible(true);
    }
    static String E_ID;
    static String name2;
    public static void main(String[] args) {

        SwingExample d= new SwingExample();
        try{
            conn= DriverManager.getConnection(url, userName, password);
            stmt= conn.createStatement();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("ID: "+d.E_ID);
        System.out.println("Name: "+name2);
    }
    public void actionPerformed(ActionEvent ed){
        if(ed.getSource()==add){
            try{
                E_ID= id.getText();
                name2= name.getText();
                stmt.executeUpdate("INSERT INTO EMP VALUES('"+E_ID+"','"+name2+"')");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
