/** Calendar method is old method it is not frequently used. */
package Java_Program.methods.DateTime;

import java.util.Calendar;

public class Method1 {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
