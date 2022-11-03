package ćwiczenia.MetodyKlasyObject.Ćwiczenie0;

import java.util.Objects;

public class Student {

    public String nameAndSurname;
    public int age;

    public Student(String nameAndSurname, int age) {
        this.nameAndSurname = nameAndSurname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && nameAndSurname.equals(student.nameAndSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname, age);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (!(obj instanceof Student))
//            return false;
//        if (age != ((Student) obj).age)
//            return false;
//        if (nameAndSurname == null) {
//            if (((Student) obj).nameAndSurname != null)
//                return false;
//        } else if (!(nameAndSurname.equals(((Student) obj).nameAndSurname)))
//            return false;
//        return true;
//    }
}
