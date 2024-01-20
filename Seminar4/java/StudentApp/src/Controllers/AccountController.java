package Controllers;

import Domain.Person;
import Domain.Worker;

import java.util.List;

public class AccountController {
    public static <T extends Worker,V> void paySalary(T person, V salar)
    {
        System.out.println(person.getName()  + " выплачена зарплата "+salar);
    }

    public static <T extends Person> double averageAge(List<T> persons) {
        double sum = 0;

        for (T person : persons) {
            sum += person.getAge();
        }

        return sum / persons.size();
    }
}