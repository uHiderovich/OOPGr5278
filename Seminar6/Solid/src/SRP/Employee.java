package SRP;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    /**
     * Метод получения информации об работнике
     * @return Информации об работнике
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
