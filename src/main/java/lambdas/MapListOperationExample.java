package lambdas;

import data.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapListOperationExample {

    public static void main(String[] args) {
        mapOperation();
        sortMapByKeys();
        convertListToMap();

    }

    private static void convertListToMap() {
        List<Developer> devList = new ArrayList<Developer>();

        devList.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        devList.add(new Developer("alvin", new BigDecimal("80000"), 20));
        devList.add(new Developer("jason", new BigDecimal("100000"), 10));
        devList.add(new Developer("iris", new BigDecimal("170000"), 55));

        Map<String, Integer> map = devList.stream().collect(Collectors.toMap(Developer :: getName, Developer :: getAge));
        System.out.println(map);

    }

    private static void sortMapByKeys() {
        Map<String, Integer> unsortedMap = getMap();
        Map<String, Integer> result =unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue,
                        (oldvalue,newvalue) -> oldvalue,LinkedHashMap::new));

        System.out.println(result);

    }


    private static void mapOperation() {

        Map<String, Integer> unsortMap = getMap();
        // Sort a Map by Key
        Map<String, Integer> result2 = new LinkedHashMap<>();

        unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEachOrdered(entry -> result2.put(entry.getKey(), entry.getValue()));

        System.out.println(" sorted Map way 1 " + unsortMap);
        System.out.println(" sorted Map way 1 " + result2);

        //other way

//        unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
//        .collect(Collectors.toMa)

    }

    private static Map<String, Integer> getMap() {
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        return unsortMap;
    }
}
