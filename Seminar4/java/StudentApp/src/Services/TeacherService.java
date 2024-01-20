package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService  implements iPersonService<Teacher<String, Integer, String>> {
    private int count;
    private List<Teacher<String, Integer, String>> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    public void sortByFIO()
    {
        PersonComparator<Teacher<String, Integer, String>> emCom = new PersonComparator<>();
        teachers.sort(emCom);
    }

    @Override
    public List<Teacher<String, Integer, String>> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher<String, Integer, String> teacher = new Teacher<String, Integer, String>(name, age, "Профессор");
        count++;
        teachers.add(teacher);
    }
}
