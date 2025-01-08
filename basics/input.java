package Java_Program.basics;

import java.util.Scanner; //Responsible for input util.Scanner class
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Responsible for input

        //byte Integer  type
        byte num1;
        System.out.print("Enter byte data type Input: ");
        num1=sc.nextByte();
        System.out.println("output: "+num1+"\n");

        //short Integer type
        short num2;
        System.out.print("Enter short data type Input: ");
        num2=sc.nextShort();
        System.out.println("output: "+num2+"\n");

        //int Integer type
        int num3;
        System.out.print("Enter int data type Input: ");
        num3=sc.nextInt();
        System.out.println("output: "+num3+"\n");

        //long Integer type
        long num4;
        System.out.print("Enter long data type Input: ");
        num4=sc.nextLong();
        System.out.println("output: "+num4+"\n");


        //float type
        float num5;
        System.out.print("Enter float data type Input: ");
        num5=sc.nextFloat();
        System.out.println("output: "+num5+"\n");

        //double type
        double num6;
        System.out.print("Enter double data type Input: ");
        num6=sc.nextDouble();
        System.out.println("output: "+num6+"\n");

        //char  type
        char char1;
        System.out.print("Enter char data type Input: ");
        char1=sc.next().charAt(0);
        System.out.println("output: "+char1+"\n");

        //String without next line
        String char2;
        System.out.print("Enter String without next Line: ");
        char2=sc.next();
        System.out.println("output: "+char2+"\n");

        //String with next line
        String char3;
        System.out.print("Enter String with next Line: ");
        char3=sc.nextLine();
        System.out.println("output: "+char3+"\n");

        //boolean type
        boolean flag;
        System.out.print("Enter boolean Value: ");
        flag=sc.nextBoolean();
        System.out.println("output: "+flag);
    }
}
