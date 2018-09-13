package kata1;

import java.time.LocalDateTime;
import java.time.Duration;

public class Person {
    private final String name;
    private final LocalDateTime birthdate;
    private final long SECONDS_PER_YEAR = (long) (60*60*24*365.25);
    
    public Person(String name, LocalDateTime birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }
     
    public int getAge(){
        LocalDateTime today = LocalDateTime.now();
        return (int) ((int) (Duration.between(birthdate, today).getSeconds())/SECONDS_PER_YEAR);
    }
}
