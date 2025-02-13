package Java_Program.strings;

public class EqualsString {
    public static void main(String[] args) {

        String str= "Hello";
        String gtr= "Hello";
        String mtr= new String("Hello");

        // when we use == operator for check two string are equal
        // then it check only add of both string and return true or false value

        // address fo str and gtr are same but address of mtr is difference
        System.out.println(str==gtr); // True, because it checks only address and return
        System.out.println(str==mtr); // False, because it checked address and return value

        // equals() function check first address if not match then check string by string
        System.out.println(str.equals(gtr)); // True, check address both match return value
        System.out.println(str.equals(mtr)); // True, check address do not match , then check string by string

        // for matching string we should always use equals() functions

    }
}
