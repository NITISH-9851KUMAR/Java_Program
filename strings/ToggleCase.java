/** Given a string, the task is to toggle all the characters of the string i.e to convert Upper case to Lower case and vice Versa */
package Java_Program.strings;

public class ToggleCase {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder( new java.util.Scanner(System.in).nextLine() ); // take input
//        String str= "NITISH kumar";
        // input Priya Rani
        // output pRIYA rANI

        char ch;
        int ascii;
        for(int i= 0; i<str.length(); i++){
            ch= str.charAt(i);
            ascii= (int)ch;

            if(ch==' ') continue;

            if(ascii>=65 && ascii<=90) // if character is capital letter then change into small
                ascii += 32;

            else if (ascii>= 97 && ascii<=122)// if character is small letter then change into Capital
                ascii -= 32;

            str.setCharAt( i, (char)ascii );
            //Same question perform with String then code is similar change only one line , but it is very poor performance code
//             str= str.substring(0, i) + (char)ascii + str.substring(i+1);
//             like   pR + I + YA rANI

        }

        System.out.println(str);
    }
}
