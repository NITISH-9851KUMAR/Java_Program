package Java_Program.strings;

public class Immutability {
    public static void main(String[] args) {

        String str= "Hello";
        System.out.println(str);

        //change "Hello" to "Heylo"
        //str.charAt(2)= 'Y' it is not possible in java
        str= str.substring(0, 2) + 'y' + str.substring(3, 5);
        // str= "Hello" it create a new  string without changing of existing Hello , it is immutability
        // we can not change existing string, while it create a new string object
        System.out.println(str);
    }
}
