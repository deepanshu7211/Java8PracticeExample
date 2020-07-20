package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >=3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >=3.0;

    static BiConsumer<String,String> biConsumer = (name,gender) -> {
        System.out.println("name " + name + " gender " + gender);
    };

    static  Consumer<Student> consumer = (student) -> {
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(),student.getGender());
        }
    };

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }
}
