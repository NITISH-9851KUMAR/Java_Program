package Java_Program.oop.modifiers;

class Base{
    private void privateBase(){
        System.out.println("Main hu privateBase class!");
    }
    protected void protectedBase(){
        System.out.println("Main hu protectedBase class!");
    }
    public void publicBase(){
        System.out.println("Main hu publicBase class!");
    }
}
class Sub extends Base{
    private void privateBase (){ // we cannot override this
       System.out.println("Main hu privateSub class!");
    }
    protected void protectedBase(){
        System.out.println("Main hu protectedSub class!");
    }
    public void publicBase(){
        System.out.println("Main hu publicSub class!");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Base b= new Sub();
//        b.privateBase(); // can not override to bas class
        b.protectedBase();
        b.publicBase();

    }
}
