package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printStudents(){

        Consumer<Student> consumer = (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }

    public static void main(String[] args) {
        Consumer<String> consumer  = (s)->{
            System.out.println(s.toUpperCase());
        };

        consumer.accept("test");

        printStudents();
    }
}
