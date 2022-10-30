package collections.set.hashSet;

import java.util.HashSet;

/**
 * HashSet<T>
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        HashSet<String> cities = new HashSet<>();
        cities.add("İzmir");
        cities.add("Muğla");
        cities.add("Edirne");
        cities.add("Antalya");
        cities.add("Denizli");
        cities.add("Edirne");

        System.out.println("Sehir sayısı : " + cities.size());

        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println("---------------");

        HashSet<Worker> workers = new HashSet<>();
        workers.add(new Worker(1, "Ali Bozlak", 30));
        workers.add(new Worker(2, "Fatma Bozlak", 55));
        workers.add(new Worker(3, "Rahile Ceylan", 72));
        workers.add(new Worker(2, "Fatma Bozlak", 55));

        System.out.println("Çalışan sayısı : " + workers.size());

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
