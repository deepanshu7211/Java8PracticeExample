package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
//        Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);

        if(student.isPresent()){
            return student.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
       /* String studentName = getStudentName();
        if(studentName!=null){
            System.out.println("length of student name " + studentName.length());
        }
        else {
            System.out.println(" name is empty ");
        }*/

       Optional<String> stringOptional =getStudentNameOptional();
       if(stringOptional.isPresent()){
           System.out.println("length of student name " + stringOptional.get().length());
       }
       else {
           System.out.println(" name is empty ");
       }
    }
}
