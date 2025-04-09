package Java_Program.oop;

public class EnumKeyword {
    enum Days{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }
    public static void main(String[] args) {

        for(Days d: Days.values()){
            weekend(d);
        }
    }
    public static void weekend(Days d){
        if(d.equals(Days.Sunday))
            System.out.println("Today is Holiday");

        else
            System.out.println("Today is working Day");
    }
}
