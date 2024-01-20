package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {
    public void printAllStudent(List<Student> students);

    public String enterTheCommand();

    public void printExitMessage();

    public Integer studentNumberToDelete();

    public void printDeletionResult(boolean isDeleted, Integer studentNumber);

    public String prompt(String msg);
}
