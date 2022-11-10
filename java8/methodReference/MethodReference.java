package java8.methodReference;

import java.util.ArrayList;

class MethodReference {
    public static void main(String[] args) {
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-2);

        numbers.forEach(n -> System.out.println(n));    // <--- With lambda
        System.out.println("----------");

        numbers.forEach(System.out::println);   // <-- Reference to static method
    }
}
