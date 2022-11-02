package collections.set.linkedHashSet;

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        System.out.println();

        // LinkedHashSet elemanları ekleme sırasına göre ekliyor. ArrayList gibi.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(3);

        System.out.println("Kümedeki eleman sayısı : " + linkedHashSet.size());
        System.out.println("Küme boş mu : " + linkedHashSet.isEmpty());
        System.out.println("Elemanlar : ");
        for (Integer number : linkedHashSet) {
            System.out.println(number);
        }
        System.out.println("-----------");

        LinkedHashSet<Araba> cars = new LinkedHashSet<>();
        cars.add(new Araba("35AA1245", "Audi", "A5"));
        cars.add(new Araba("34AA1245", "Mercedes", "X"));
        cars.add(new Araba("38DV4523", "Hacı Murat", "1970"));
        cars.add(new Araba("34AA1245", "Mercedes", "X"));

        for (Araba car: cars) {
            System.out.println(car);
        }
    }
}
