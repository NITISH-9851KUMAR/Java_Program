package Java_Program.strings;

import static java.lang.System.out;
public class Substrings {
    public static void main(String[] args) {

        String str= "abcd";
        //substring of abcd -> a, ab, abc, abcd, b, bc, bcd, c, cd, d continues part String

        //print substring from 1 position
        out.println(str.substring(1)); // give the substring from 1st position to last position


        out.print(str.substring(0, 2)+" ");
        //print substring oth index to 2-1 index 0 to 1
        out.print(str.substring(0, 3)+" ");
        //print substring oth index to 3-1 ( index 0 to 10 ) not include m


    }
}