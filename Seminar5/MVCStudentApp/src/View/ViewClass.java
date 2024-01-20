package View;

import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {

    private iGetController contr;

    public void setContr(iGetController contr) {
        this.contr = contr;
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

    public void ViewRun()
    {
        contr.run();
    }
}
