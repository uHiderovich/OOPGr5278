package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> students;

    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return new ArrayList<>(students.values());
    }

    public boolean deleteStudent(Integer studentNumber) {
        if (students.containsKey(studentNumber)) {
            students.remove(studentNumber);
            return true;
        } else {
            return false;
        }
    }
}
