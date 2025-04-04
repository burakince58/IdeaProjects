import java.util.HashMap;
import java.util.Map;
/*
public class Playground {

    private static Map<Long, Long> cache = new HashMap<>();
    public static long factorial(long number) {

        if (cache.containsKey(number)) {
            System.out.println("Cache Worked");
            return cache.get(number); // Return cached result if present

        }

        long fact = 1;
        for(int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        cache.put(number, fact); // Store the result in the cache

        return fact;
    }
}
*/

import java.util.*;
public class Playground {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(18, 46, 18, 12);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(list); // [18, 46, 18, 12]
        Collections.reverse(list);
        System.out.println(list); // [12, 18, 46, 18]
        Collections.sort(list);
        System.out.println(list); // [12, 18, 18, 46]
        System.out.println(set); // [12, 18, 46]
        System.out.println(Collections.disjoint(list, set)); // false
        System.out.println(Collections.frequency(list, 18)); // 2
        System.out.println(Collections.frequency(set, 18)); // 1
        Collections.replaceAll(list, 18, 22);
        System.out.println(list); // [12, 22, 22, 46]

        var mylist = Arrays.asList(18, 46, 18, 12);

        List<String> carBrands = Arrays.asList("BMW", "Audi", "Mercedes", "Seat", "Volkswagen", "Hyundai", "Tesla");

        var BrandsCar = Arrays.asList("BMW", "Audi", "Mercedes", "Seat", "Volkswagen", "Hyundai", "Tesla");
        Collections.sort(BrandsCar, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return 0;
                    }
        });

        Collections.sort(mylist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (String brand : carBrands) { // Printing the list elements
            System.out.println(brand);
        }


    }
}