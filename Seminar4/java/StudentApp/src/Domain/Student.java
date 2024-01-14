package Domain;


public class Student<T extends String, E extends Integer> extends Person implements Comparable<Student> {

    private int id;
    private static int generalId;

    public Student(T name, E age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "\n    Student [id=" + id + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getName() + " - " + o.getName());

        if (o.getAge() > super.getAge()) {
            return -1;
        }

        if (o.getAge() < super.getAge()) {
            return 1;
        }

        if (o.getId() > id) {
            return -1;
        }

        if (o.getId() < id) {
            return 1;
        }

        return 0;
    }
}


