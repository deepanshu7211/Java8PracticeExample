package stream;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
            return integerList.stream()
            .reduce(1,(a,b)-> a*b);
            //Identity - default value
        // a=1,b=1 result =1
        //a=1,b=2 result =2
        //a=2,b=3 result =6
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> s1.getGpa()>s2.getGpa()?s1:s2);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println(performMultiplication(integerList));

        Optional<Student> studentOptional = getHighestGpaStudent();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
    }
}
