package streamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }


    public static Long counting(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.counting());
    }

    public static void mapping(){
        List<String> studentsNameList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));

        studentsNameList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println(" joining 1 " + joining_1());
        System.out.println(" joining 2 " + joining_2());
        System.out.println(" counting " + counting());
        mapping();
    }
}
