package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierImpl implements Multiplier{

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,2,3);
        System.out.println("Multiplication " + multiplier.multiply(integerList));
        System.out.println("List size " + multiplier.size(integerList));
        System.out.println("List Empty or not " + Multiplier.empty(integerList));
    }

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }
}
