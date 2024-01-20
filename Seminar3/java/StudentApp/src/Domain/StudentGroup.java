package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    @Override
    public String toString() {
        return "\n  StudentGroup {\n" +
                "   idGroup = " + idGroup +
                "\n   studentsNumber = " + group.size() +
                "\n   group = " + group +
                "\n  }";
    }

    @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup g) {
        if (g.getGroup().size() > group.size()) {
            return -1;
        }

        if (g.getGroup().size() < group.size()) {
            return 1;
        }

        if (g.getIdGroup() > idGroup) {
            return -1;
        }

        if (g.getIdGroup() < idGroup) {
            return 1;
        }

        return 0;
    }
}
