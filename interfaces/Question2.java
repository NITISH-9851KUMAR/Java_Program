package Java_Program.interfaces;

interface ExtraLarge{
    String extra= "This is Extra-Large!";
//    void print();
}

class large {
    void print(){
        System.out.println("This is large!");
    }
}

class medium extends large{
    void print(){
        super.print();
        System.out.println("This is Medium!");
    }
}

class Small extends medium{
    void print(){
        super.print();
        System.out.println("This is Small!");
    }
}

public class Question2 implements ExtraLarge{
    static void print(){
        System.out.println(extra);
    }
    public static void main(String[] args) {
        Small small= new Small();
        small.print();
        print();
    }
}
