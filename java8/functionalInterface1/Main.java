package java8.functionalInterface1;

import java.util.ArrayList;
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        System.out.println();

        // Anonim (İsimsiz) class ile yapalım:
        Matematik matematik = new Matematik() {
            @Override
            public void islem(double a, double b) {
                System.out.println(a + b);
            }
        };
        matematik.islem(2, 5);
        System.out.println("----------");

        // Lambda ile yapalım : 
        Matematik matematik2 = (x,y) -> System.out.println(x + y);
        matematik2.islem(2, 5);

        Matematik matematik3 = (x,y) -> System.out.println(x * y);
        matematik3.islem(2, 5);
        System.out.println("---------------");

        // Hazır Functional Interfaceler :
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İzmir");
        sehirler.add("Ankara");
        sehirler.add("Muğla");
        sehirler.add("Aydın");

        // Consumer :
        System.out.println("Consumer :");
        sehirler.forEach(sehir -> System.out.println(sehir));

        // Predicate :
        System.out.println("Predicate :");
        Predicate<String> predicate = (string) -> string.startsWith("A");
        sehirler.forEach(sehir -> {
            if (predicate.test(sehir)) {
                System.out.println(sehir);
            }
        });
    }
}
