package Java_Program.strings;

public class Concatenation {
    public static void main(String[] args) {

        String str= "Sandip ";

        str += "University "; //add string
        System.out.println(str);

        str += 'a'; // add char
        System.out.println(str);

        str += " 123"; //add number
        System.out.println(str);

        //concatenation function
        str= str.concat(" B.Tech"); //using concatenation funciton
        System.out.println(str);

    }
}
