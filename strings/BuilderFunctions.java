package Java_Program.strings;

public class BuilderFunctions {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("Hello");
        System.out.println(str);

        // set character 'M' at 0th position
        str.setCharAt(0,'M');
        System.out.println(str); // Mello

        // insert
        str.insert(2,'y'); // insert at 2nd position new character and existing char shift to the right
        System.out.println(str); // Meyllo

        //delete nth position
        str.deleteCharAt(2); // Mello  removed at 2nd position
        System.out.println(str);
    }
}
