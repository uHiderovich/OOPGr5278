package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {
    public String enterTheCommand() {
        return prompt("Введите команду:");
    }

    public void printExitMessage() {
        System.out.println("Выход из программы");
    }

    public Integer studentNumberToDelete() {
        return Integer.parseInt(prompt("Введите номер студента:"));
    }

    public void printStudentIsRemoved(Integer studentNumber) {
        System.out.println("Студент под номером " + studentNumber + " удален");
    }

    public void printStudentNotFound(Integer studentNumber) {
        System.out.println("Студента под номером " + studentNumber + " не существует");
    }

    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------------Список студентов------------");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }


    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
