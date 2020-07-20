package methodreference;

import java.util.function.Function;

public class FunctionMethodRefExample {

    static Function<String,String> function = (s) -> s.toUpperCase();
    static Function<String,String> methodFunctionRef = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println("using lambda " + function.apply("java8"));
        System.out.println("using lambda with method Reference " + methodFunctionRef.apply("java8"));
    }
}
