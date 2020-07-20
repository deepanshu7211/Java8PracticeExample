package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable("helllo"); // It will take care of Null values also
        return stringOptional;
    }


    public static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("helllo"); // If we pass Null it will throw null pointer exception
        return stringOptional;
    }


    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void optionalFlatMap(){
        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();
        Optional<String> bikename = studentOptional
                .filter(student -> student.getGpa()>=3.5) //Optional<Student Optional<Bike>>
                .flatMap(Student::getBike) // Optional Bike
                .map(Bike::getName);

        bikename.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("of Nullable " + ofNullable());
        System.out.println("of  " + of());
        System.out.println("empty  " + empty());
        optionalFlatMap();
    }
}
