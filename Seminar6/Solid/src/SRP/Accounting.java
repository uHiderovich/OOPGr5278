package SRP;

import java.util.HashMap;

public class Accounting {
    private HashMap<String, Integer> employeeSalaries;

    public Accounting() {
        this.employeeSalaries = new HashMap<>();
    }

    /**
     * Калькулятор ЗП для работника
     * @param employeeName
     * @return ЗП
     */
    public int calculateNetSalary(String employeeName) {
        int employeeSalary = employeeSalaries.get(employeeName);

        int tax = (int) (employeeSalary * 0.25);
        return employeeSalary - tax;
    }
}
