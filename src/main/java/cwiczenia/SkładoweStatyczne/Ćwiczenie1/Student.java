package cwiczenia.SkładoweStatyczne.Ćwiczenie1;

public class Student {

    private String firstName;
    private String lastName;
    private int studentIndexNumber;
    private static int numberOfStudents;

    public Student(String firstName, String lastName, int studentIndexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndexNumber = studentIndexNumber;
        numberOfStudents++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentIndexNumber() {
        return studentIndexNumber;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentIndexNumber(int studentIndexNumber) {
        this.studentIndexNumber = studentIndexNumber;
    }
}
