package Java_Program.basics;

public class incre_decre {
    public static void main(String[] args) {

        //increment operator
        int x=5;
        System.out.println("x: "+x);
        x++; //++ is increment operator
        //same as x=x+1;

        System.out.println(x);
        System.out.println(x++); //pahle x ka value print karo phir badhao karo
        System.out.println(x);

        System.out.println(++x); //pahle x ka value badhao karo phir print karo

        //Decrement Operator
        int y=10;
        System.out.println("Y: "+y);
        y--; //--is decrement operator
        //same as y=y-1;
        System.out.println(y);

        System.out.println(y--); //pahle y ka value print karo phir ghatao karo
        System.out.println(y);

        System.out.println(--y); //pahle y ka value ghatao phir print karo
    }
}
