package Java_Program.oop.superKeyword;

public class SuperMethod {
    public static class Cat{
        void speak(){
            System.out.println("Meaon! ");
        }
    }
    public static class PetCat extends Cat{
        void speak(){
            System.out.println("Meow! ");
        }
    }
    public static class MagicCat extends Cat{
        static boolean noOne;
        void speak(){
            if(noOne){
                super.speak(); //use the superclass definition
            }else {
                System.out.println("MagicCat Meow!");
            }
        }
    }
    public static void main(String[] args) {
        PetCat petCat= new PetCat();
        MagicCat magicCat= new MagicCat();
        magicCat.noOne= true;
        magicCat.speak();
        petCat.speak();
        magicCat.noOne= false;
        magicCat.speak();

    }
}
