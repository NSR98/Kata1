package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Nahuel", new Date(98,10,14));
        System.out.println("Tienes " + person.getAge() + " años");
    }
    
}
