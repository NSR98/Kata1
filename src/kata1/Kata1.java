package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Nahuel", LocalDate.of(1998, Month.NOVEMBER, 14));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
