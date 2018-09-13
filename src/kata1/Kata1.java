package kata1;

import java.time.LocalDateTime;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Nahuel", LocalDateTime.of(1998, Month.NOVEMBER, 14, 15, 30, 00));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
