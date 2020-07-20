package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> function =(name) -> name.toUpperCase();
    static Function<String,String> function2 =(name) -> name.toUpperCase().concat("extra String");

    public static void main(String[] args) {
        System.out.println(function.apply("java8"));
        System.out.println(function.andThen(function2).apply("java8"));
        System.out.println(function.compose(function2).apply("java8"));
    }
}
