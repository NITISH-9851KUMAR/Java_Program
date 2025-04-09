/** It is modern API, most powerful date-time API introduce java 8.
 * The classes are immutable and thread-safe, and they support a wide range of operations
 *  */
package Java_Program.methods.DateTime;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Method4 {
    public static void main(String[] args) {

        LocalTime time= LocalTime.now();
        System.out.println(time);

        LocalDate date= LocalDate.now();
        System.out.println(date);

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
