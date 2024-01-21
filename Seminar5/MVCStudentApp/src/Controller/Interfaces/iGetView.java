package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {
    /**
     * Распечатать список студентов
     * @param students
     */
    public void printAllStudent(List<Student> students);

    /**
     * Распечатать сообщение "Введите команду"
     */
    public String enterTheCommand();

    /**
     * Распечатать сообщение "Выход из программы"
     */
    public void printExitMessage();

    /**
     * Ввести номер студента для удаления
     */
    public Integer studentNumberToDelete();

    /**
     * Распечатать результат удаления студента
     */
    public void printDeletionResult(boolean isDeleted, Integer studentNumber);

    /**
     * Распечатать сообщение, запросить в вод данных
     * @param msg Сообщение
     * @return Результат ввода
     */
    public String prompt(String msg);
}
