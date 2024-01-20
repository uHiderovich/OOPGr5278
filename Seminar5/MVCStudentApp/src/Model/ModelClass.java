package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {

    private List<Student> students;

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
