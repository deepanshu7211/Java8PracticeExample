package lambdas;

import data.Student;
import data.StudentDataBase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ComparatorExample {
    public static void main(String[] args) {
        comparatorDeveloper();
    }


    public static void comparatorDeveloper() {
        List<Student> students = StudentDataBase.getAllStudents();

        System.out.println(" Before Sorting ");
        students.forEach( student -> System.out.println(student));

        students.sort(Comparator.comparing(Student::getName));
        System.out.println(" After Sorting ");

        students.forEach(System.out::println);

        // Sort By salary in reversed order
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
        students.sort(comparator.reversed());
        System.out.println("List in reversed order based on salary");

        students.forEach(System.out::println);

        System.out.println(" sorting by agee and name ");
        Comparator<Student> sortByAge = Comparator.comparing(Student :: getGpa).thenComparing(Student::getGradeLevel);
        students.sort(sortByAge.reversed());
        students.forEach(System.out::println);

    }

}