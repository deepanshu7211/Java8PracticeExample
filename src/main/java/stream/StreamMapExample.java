package stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> getNamesList(){

        return StudentDataBase.getAllStudents().stream() //Stream of Student
                .map(Student::getName) //Stream of String Name
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(getNamesList());
    }
}
