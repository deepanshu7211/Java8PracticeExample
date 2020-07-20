package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //Java 7

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Using Java 7 "+comparator.compare(3,2));

//        Using Java 8

        Comparator<Integer> lambdaComparator = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Using Java 8 " + lambdaComparator.compare(3,2));

        Comparator<Integer> lambdaComparator2 = ( a, b) -> a.compareTo(b);
        System.out.println("Using Java 8 " + lambdaComparator2.compare(3,2));
    }
}
