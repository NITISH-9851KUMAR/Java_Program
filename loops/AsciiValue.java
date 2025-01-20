/** Write a program to print all the ASCII value and their equivalent character of 26 alphabets using a while loop. */

package Java_Program.loops;

public class AsciiValue {
    public static void main(String[] args) {

        int num=65; //Ascii value of capital A
        int num2=97; //Ascii value of small a
        char ch;
        while(num!=91){
            ch=(char)num;
            System.out.print("'"+ch+"'"+"->"+num+"    ");
            ch=(char)num2;
            System.out.println("'"+ch+"'"+"->"+num2);
            num++;
            num2++;
        }

    }
}
