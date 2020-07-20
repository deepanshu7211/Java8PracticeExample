package stream;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void getStudentActivities(){

        List<String> studentActivitesList = StudentDataBase.getAllStudents().stream() //Stream of STudent
                .map(Student::getActivities) //Stream of List<String>
                .flatMap(List::stream) // Stream of Strings
                .collect(Collectors.toList());
        System.out.println(studentActivitesList);

    }

    public static void getStudentSorted(){

        List<Student> students = StudentDataBase.getAllStudents().stream() //Stream of STudent
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println("student sorted ");
        students.forEach(System.out::println);

    }

    public static void main(String[] args) {

//        getStudentActivities();
        getStudentSorted();
    }
}
