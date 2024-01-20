package Domain;

public class Employee<T extends String, E extends Integer, K> extends Worker {
    private K special;

    public Employee(T firstName, E age, K special) {
        super(firstName, age);
        this.special = special;
    }
}
