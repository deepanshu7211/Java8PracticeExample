package streamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupByExample {

    public static void groupStudentByGender(){
       Map<String, List<Student>> studentMaps = StudentDataBase.getAllStudents().stream()
        .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMaps);
    }

    public static void main(String[] args) {
        groupStudentByGender();
    }
}
