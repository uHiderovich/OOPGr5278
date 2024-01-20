package Domain;

public class Teacher<T extends String, E extends Integer, K> extends Worker {
    private K acadDegree;
    public Teacher(T firstName, E age, K acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
