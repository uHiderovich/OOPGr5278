package Controller;

import java.util.*;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

/**
 * Класс контроллера
 */
public class ControllerClass implements iGetController {
    /**
     * Отображение
     */
    private iGetView selectedView;
    /**
     * Словарь с достпными отображениями
     */
    private HashMap<String, iGetView> viewsMap;
    /**
     * Список с достпными моделями
     */
    private List<iGetModel> models;
    /**
     * Список студентов
     */
    private List<Student> studBuffer = new ArrayList<>();

    /**
     * Конструктор класса контроллера
     */
    public ControllerClass() {
        this.viewsMap = new HashMap<>();
        this.models = new ArrayList<>();
    }

    public void setView(String language) throws ViewException {
        if (!viewsMap.containsKey(language)) {
            throw new ViewException("View not found");
        }

        this.selectedView = viewsMap.get(language);
    }

    public void addModel(iGetModel model) {
        this.models.add(model);
    }

    public void selectLanguage() throws ViewException  {
        Set<String> availableLanguages = viewsMap.keySet();

        if (availableLanguages.size() == 0) {
            throw new ViewException("No languages available");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Select a language. Available languages:");

        for (String language : availableLanguages) {
            System.out.println(language);
        }

        String language = in.nextLine();

        setView(language);
    }

    public void addView(String language, iGetView view) {
        viewsMap.put(language, view);
    }

    /**
     * Метод для тестирования
     * @param students Список студентов
     * @return
     */
    private boolean tesdData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Метод ля обновления отображения
     * @param Request
     */
    public void update(String Request)
    {
        //MVP
//        studBuffer = model.getStudents();
//        if(tesdData(studBuffer))
//        {
//            view.printAllStudent(studBuffer);
//        }
//        else
//        {
//            System.out.println("Список студентов пуст!");
//        }

        //MVC
        for (iGetModel model : models) {
            selectedView.printAllStudent(model.getStudents());
        }
    }

    public void run()
    {
        if (models.size() == 0) {
            System.out.println("No available models were found");
            return;
        }

        try {
            selectLanguage();
        } catch (ViewException e) {
            System.out.println(e.getMessage());
            return;
        }

        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = selectedView.enterTheCommand();
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                   getNewIter = false;
                    selectedView.printExitMessage();
                   break;
                case LIST:
                    for (iGetModel model : models) {
                        selectedView.printAllStudent(model.getStudents());
                    }
                   break;
                case DELETE:
                    Integer studentNumber = selectedView.studentNumberToDelete();
                    boolean studentIsRemoved = false;

                    for (iGetModel model : models) {
                        studentIsRemoved = model.deleteStudent(studentNumber);

                        if (studentIsRemoved) {
                            selectedView.printStudentIsRemoved(studentNumber);
                            break;
                        }
                    }

                    if (!studentIsRemoved) {
                        selectedView.printStudentNotFound(studentNumber);
                    }

                    break;
            }
        }
    }
}
