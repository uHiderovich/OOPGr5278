package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
   public List<Student> getStudents();

   public boolean deleteStudent(Integer studentNumber);
}
