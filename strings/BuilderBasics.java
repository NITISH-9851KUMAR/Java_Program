package Java_Program.strings;
public class BuilderBasics {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("Hello"); // declare and initialisation
        System.out.println(str);

        // for concat two stringBuilder use append function
        str.append("World"); // append in StringBuilder from last side
        System.out.println(str);

    }
}
