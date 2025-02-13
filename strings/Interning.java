package Java_Program.strings;

public class Interning {
    public static void main(String[] args) {

        String str= "Hello";
        String gtr= "Hello";
        String mtr= "Hello";
        //The strings str, gtr, and mtr, have the same value, so there will only be one string literal
        //"Hello" in the memory, and these three Strings will point to the same String literal.
        //It is interning of String

        //The interning of strings can be removed with the new keyword
        String st1= "String";
        String st2= new String("String");

        //The string st1 and st2 create separate memory locations in the string pool and now point to different strings.

    }
}
