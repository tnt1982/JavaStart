package ćwiczenia.OperacjaNaPlikach.Ćwiczenie1;

import java.io.Serializable;

public class Company implements Serializable {

    public static final int MAX_EMPLOYEE = 3;
    private Employee[] employees = new Employee[MAX_EMPLOYEE];
    private int index = 0;

    public void add(Employee employee) {
        employees[index] = employee;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
            stringBuilder.append(employee.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
