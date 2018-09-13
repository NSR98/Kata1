package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1998,11,14);
        Person person = new Person("Nahuel", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
