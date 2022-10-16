package ćwiczenia.SkładoweStatyczne.Ćwiczenie1;

public class University {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Liczba studentów przed otwarciem listy: " + Student.getNumberOfStudents());
        Thread.sleep(2000);
        System.out.println();

        Student firstStudent = new Student("Pierwszy", "Student", 1);
        printConsecutiveNumberOfStudent();
        Student secondStudent = new Student("Drugi", "Student", 2);
        printConsecutiveNumberOfStudent();
        Student thirdStudent = new Student("Trzeci", "Student", 3);
        printConsecutiveNumberOfStudent();

        System.out.println();

        System.out.println("Aktualna liczba studentów wynosi: " + Student.getNumberOfStudents());
    }

    private static void printConsecutiveNumberOfStudent() throws InterruptedException {
        System.out.println("Zapisał się student numer " + Student.getNumberOfStudents());
        Thread.sleep(2000);
    }
}
