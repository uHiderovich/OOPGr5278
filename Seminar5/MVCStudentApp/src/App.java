import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.Domain.Student;
import Model.ModelClassHash;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        // Модель 1
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        Student student6 = new Student("Karina", 25);

        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(0, student1);
        studentHashMap.put(1, student2);
        studentHashMap.put(2, student3);
        studentHashMap.put(3, student4);
        studentHashMap.put(4, student5);
        studentHashMap.put(5, student6);

        iGetModel modelClassHash = new ModelClassHash(studentHashMap);

        // Модель 2
        Student student7 = new Student("Andrey", 22);
        Student student8 = new Student("Masha", 27);
        Student student9 = new Student("Irina", 28);
        Student student10 = new Student("Nikolay", 30);

        List<Student> studList = new ArrayList<>();
        studList.add(student7);
        studList.add(student8);
        studList.add(student9);
        studList.add(student10);

        iGetModel model = new ModelClass(studList);

        ViewClass view = new ViewClass();
        ViewClassEng viewEng = new ViewClassEng();

        ControllerClass controller = new ControllerClass(modelClassHash);
        controller.addView("ru", view);
        controller.addView("en", viewEng);
        controller.run();
    }
}
