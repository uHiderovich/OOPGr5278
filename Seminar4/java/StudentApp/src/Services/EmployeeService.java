package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;

public class EmployeeService implements iPersonService<Employee<String, Integer, String>> {
    private int count;
    private List<Employee<String, Integer, String>> employees;
    public EmployeeService() {
        employees = new ArrayList<>();
    }

    @Override
    public List<Employee<String, Integer, String>> getAll() {
        return employees;
    }
    @Override
    public void create(String name, int age) {
        Employee<String, Integer, String> emp = new Employee<String, Integer, String>(name, age, "разнорабочий");
        count++;
        employees.add(emp);
    }

    public void sortByFIO()
    {
        PersonComparator<Employee<String, Integer, String>> emCom = new PersonComparator<>();
        employees.sort(emCom);
    }
}
