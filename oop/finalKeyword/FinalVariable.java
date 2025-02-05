package Java_Program.oop.finalKeyword;

public class FinalVariable {
    public static class Base{
        final String schoolName= "Sandip University";
        public Base(){
            System.out.println("College Name: "+schoolName);
        }
    }



    public static void main(String[] args) {
        Base base= new Base();
        // base.schoolName= "Sandip College"; It cannot be modified because it final in Base Class
    }
}
