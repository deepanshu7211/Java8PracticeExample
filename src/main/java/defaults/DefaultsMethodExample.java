package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class DefaultsMethodExample {

    static Consumer<Student> studentConsumer = (st) -> System.out.println(st);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);

    public static void sortByName(List<Student> students){
        System.out.println("after sortuing by name ");

        students.sort(nameComparator);
        students.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> students){
        System.out.println("after sortuing by GPA");

        students.sort(gpaComparator.reversed());
        students.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> students){
        System.out.println("after sortuing by GPA and then Name ");

        students.sort(gpaComparator.reversed().thenComparing(nameComparator));
        students.forEach(studentConsumer);
    }

    public static void sortNaturalOrder(){
        List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");

        // Java 7
        /*Collections.sort(stringList);
        System.out.println(" using java 7 " + stringList);*/

        stringList.sort(Comparator.naturalOrder());
        stringList.sort(Comparator.reverseOrder());
        System.out.println("using java 8 " + stringList);
    }

    public static void sortWithNullValues(){
        List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike",null);
//        stringList.sort(Comparator.naturalOrder()); //It will throw null pointer exception
        stringList.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("using java 8 handling nulls " + stringList);
    }

    public static void main(String[] args) {
//        sortNaturalOrder();
          List<Student> studentList = StudentDataBase.getAllStudents();
          System.out.println("before sorting");
          studentList.forEach(studentConsumer);
//          sortByName(studentList);
//          sortByGPA(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues();
    }
}
