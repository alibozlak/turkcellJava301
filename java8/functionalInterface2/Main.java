package java8.functionalInterface2;

import java.util.function.Supplier;

class Main {
    public static void main(String[] args) {
        System.out.println();

        // Supplier :
        Supplier<Urun> supplier = () -> new Urun(1, "Laptop", 15_000);
        System.out.println(supplier.get());
    }    
}
