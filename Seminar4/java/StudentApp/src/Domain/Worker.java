package Domain;

public class Worker<T extends String, E extends Integer> extends Person {
    public Worker(T name, E age) {
        super(name, age);
    }
}
