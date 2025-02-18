package Java_Program.strings;

public class BuilderFunctions {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("Hello");
        System.out.println(str);

        str.append(" World"); // append from last side in stringBuilder
        //Hello World

        // set character 'M' at 0th position
        str.setCharAt(0,'M');
        System.out.println(str); //Mello World

        // insert
        str.insert(2,'y'); // insert at 2nd position new character and existing char shift to the right
        System.out.println(str); // Meyllo World

        //delete nth position
        str.deleteCharAt(2); // Meyllo--> Mello World removed at 2nd position
        System.out.println(str);

        str.delete(3, 5); // delete from 3rd position to 5-1th position
        System.out.println(str);

        StringBuilder str1= new StringBuilder("wallah");
        str1.reverse(); // Reverse StringBuilder
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);

        System.out.println(str1.substring(0, 4));    // substring from oth position to 4-1th position
        System.out.println(str1.substring(1));  // substring to 1st position till last

        str1.setLength(0); // create string length zero
        System.out.println(str1); // NUll


    }
}
