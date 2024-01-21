package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
   /**
    * Метод для получения списка студентов
    * @return Список студентов
    */
   public List<Student> getStudents();

   /**
    * Метод удаления стедента по номеру
    * @param studentNumber Номер студента для удаления
    * @return boolean Флаг успешности удаления студента
    */
   public boolean deleteStudent(Integer studentNumber);
}
