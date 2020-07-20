package numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfNNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,Integer::sum);
    }

    public static int sumOfNNumberIntStream(){
        return IntStream.rangeClosed(1,5)
        .sum();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(sumOfNNumbers(list));
        System.out.println("using Int Stream " + sumOfNNumberIntStream());
    }
}
