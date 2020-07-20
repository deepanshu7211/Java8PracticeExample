package functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> mutliply = (a,b) ->{
            System.out.println(" multiply " + (a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("division " + (a/b));
        } ;

        mutliply.andThen(division).accept(10,5);
    }
}
