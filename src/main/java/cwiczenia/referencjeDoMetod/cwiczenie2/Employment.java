package cwiczenia.referencjeDoMetod.cwiczenie2;

public enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    boolean checkEmployeeEmployment(Employee employee) {
        return this.equals(employee.getEmployment());
    }
}

