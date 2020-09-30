package Kata1;
import java.time.LocalDate;
import java.time.Month;

/**
 * @author Alexandru
 */
public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Luis Hernandez", LocalDate.of(1980, Month.MARCH, 25));
        System.out.println(person.getName() +  " " + person.getAge());
    }
}