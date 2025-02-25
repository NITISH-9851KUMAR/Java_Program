/** Java program reverse each word in sentence*/
package Java_Program.strings;

public class ReverseWord {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("I am an educator");
        StringBuilder s= new StringBuilder("");
        for(int i= 0; i<str.length(); i++){

            if(str.charAt(i)==' ') {
                s.append(' ');
                System.out.print( s.reverse() );
                s.setLength(0);
            }
            else s.append(str.charAt(i));
        }
        System.out.println(" "+s.reverse());

    }
}
