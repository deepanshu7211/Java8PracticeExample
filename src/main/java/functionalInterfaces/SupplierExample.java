package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<Student>> supplier = () -> StudentDataBase.getAllStudents();
        System.out.println("supplier lsit example " + supplier.get());
    }
}

