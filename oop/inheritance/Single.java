package Java_Program.oop.inheritance;

//Create a super class
public class Single {
    public static class A{
        int i, j;
        void showij(){
            System.out.println("i and j: "+i+"  "+j);
        }
    }
    //create a subclass by extending class A
    public static class B extends A{
        int k;
        void showk(){
            System.out.println("k: "+k);
        }
        void sum(){
            System.out.println("i+j+k: "+(i+j+k));
        }
    }
    public static void main(String[] args) {
        A superOb= new A();
        B subOb= new B();
        //The super class may be used by itself
        superOb.i= 10;
        superOb.j= 14;
        System.out.println("Content of superOb: ");
        superOb.showij();
        System.out.println();

        //The subclass has access all the public members of its super class
        subOb.i= 23;
        subOb.j= 53;
        subOb.k= 12;
        System.out.println("Content of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i j and k in subOb: ");
        subOb.sum();

    }
}
