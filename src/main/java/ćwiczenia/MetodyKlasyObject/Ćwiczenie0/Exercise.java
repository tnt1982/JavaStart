package ćwiczenia.MetodyKlasyObject.Ćwiczenie0;

import java.util.Objects;

public class Exercise {

    public static void main(String[] args) {

        String name1 = "Ko";
        String name2 = "Ka";

        System.out.println("hashCode from name1: " + name1.hashCode());
        System.out.println("hashCode from name2: " + name2.hashCode());

        boolean trueOrFalse = Objects.equals(name1, name2);

        if (trueOrFalse == true) {
            System.out.println("Objekty " + name1 + " i " + name2 + " są takie same.");
        } else {
            System.out.println("Objekty " + name1 + " i " + name2 + " nie są takie same.");
        }

        name1.equals(name2);

        Student student1 = new Student("Adam Studencki", 19);
        Student student2 = new Student("Adam Studencki", 19);

        System.out.println("Porównanie Objects.equals(student1, student2)");
        boolean compareTwoStudents = Objects.equals(student1, student2);

        System.out.println(compareTwoStudents);

        System.out.println("hashCode from student1: " + student1.hashCode());
        System.out.println("hashCode from student2: " + student2.hashCode());

        System.out.println(student1.toString());

    }
}
