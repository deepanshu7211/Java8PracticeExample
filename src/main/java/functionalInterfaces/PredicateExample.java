package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void main(String[] args) {
        Predicate<Integer> predicate= (i) -> i%2==0;

        System.out.println(predicate.test(4));
        System.out.println("And Condition " + p1.and(p2).test(10));
        System.out.println("And Condition " + p1.or(p2).test(8));

    }
}
