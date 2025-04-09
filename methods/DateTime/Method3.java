/** java.text.SimpleDateFormat: Used for formating and Parsing dates. This class work with
 * java.util.Date and allows us to format the date into a string back into a date object */
package Java_Program.methods.DateTime;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Method3 {
    public static void main(String[] args) {
        // For date
        Date date= new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatter.format(date));

        // For time
        Date time= new Date();
        SimpleDateFormat formatter2= new SimpleDateFormat("hh:mm");
        System.out.println(formatter2.format(time));

    }
}
