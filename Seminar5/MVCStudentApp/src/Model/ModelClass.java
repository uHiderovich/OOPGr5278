package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

/**
 * Класс модели списка студентов
 */
public class ModelClass implements iGetModel {
    /**
     * Список студентов
     */
    private List<Student> students;

    /**
     * Конструкторк модели
     * @param students Список студентов
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public boolean deleteStudent(Integer studentNumber) {
        if (students.size() > studentNumber) {
            students.remove(studentNumber - 1);
            return true;
        } else {
            return false;
        }
    }
}
