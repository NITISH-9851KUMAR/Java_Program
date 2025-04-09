/** It is modern API, most powerful date-time API introduce java 8.
 * The classes are immutable and thread-safe, and they support a wide range of operations
 *  */
package Java_Program.methods.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Method5 {
    public static void main(String[] args) {

        LocalDateTime localDateTime= LocalDateTime.now();

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yy  hh:mm");
        System.out.println("Without Format: "+localDateTime);
        System.out.println("With Format: "+localDateTime.format(formatter));

    }
}
