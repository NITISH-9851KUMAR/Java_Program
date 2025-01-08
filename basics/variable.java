package Java_Program.basics;

public class variable{
    public static void main(String[] args){

        int x; //declare a variable int datatype
        x=20;
        //or
        int y=30; //also declare a variable
        System.out.println("The value of x: "+x);
        System.out.println("The value of y: "+y);

        x=40;
        y=90;
        System.out.println(x);
        System.out.println(y);

        x=x+90;
        y=y+130;
        System.out.println(x);
        System.out.println(y);

        System.out.println(x+200);
        System.out.println(y+300);

        int m=10, n=30, p=17;  //
        System.out.println("m "+m+"  n "+n+"  p "+p);
    }
}