package java8.stream1;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        System.out.println();

        // Streamler herhangi bir collection tipi veya diziler üzerinde işlem
        // yapabilirler.
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(9);
        integers.add(-5);
        integers.add(8);
        integers.add(1);

        Stream<Integer> stream1 = integers.stream();
        Stream<Integer> stream2 = stream1.filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                return t + 5 > 7;
            }

        });
        Stream<Integer> stream3 = stream2.map(new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t * 3;
            }
            
        });
        stream3.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println(t-1);
            }
            
        });

        System.out.println("----------");

        System.out.println(integers);

        System.out.println("----------");

        // With lambda :
        integers.stream().filter(i -> i + 5 > 7).map(i -> i * 3).forEach(i -> System.out.println(i - 1));

    }
}
