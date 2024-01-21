package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClassEng implements iGetView {
    public String enterTheCommand() {
        return prompt("Enter the command:");
    }

    public void printExitMessage() {
        System.out.println("Exiting the program");
    }

    public Integer studentNumberToDelete() {
        return Integer.parseInt(prompt("Enter the student's number:"));
    }

    public void printStudentIsRemoved(Integer studentNumber) {
        System.out.println("Student under the number " + studentNumber + " has been deleted");
    }

    public void printStudentNotFound(Integer studentNumber) {
        System.out.println("Student under the number " + studentNumber + " does not exist");
    }

    public void printAllStudent(List<Student> students) {
        System.out.println("-------------Student's list------------");
        for (Student s : students) {
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
