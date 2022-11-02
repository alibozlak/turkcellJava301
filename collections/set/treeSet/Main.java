package collections.set.treeSet;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        System.out.println();

        TreeSet<String> colors = new TreeSet<>();
        colors.add("Siyah");
        colors.add("Beyaz");
        colors.add("Mavi");
        colors.add("Turuncu");
        colors.add("Mavi");

        System.out.println("Renklerin sayısı : " + colors.size());
        System.out.println("Renkler : ");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("------------");

        TreeSet<City> cities = new TreeSet<>();
        cities.add(new City("35", "İzmir"));
        cities.add(new City("23", "Eskişehir"));
        cities.add(new City("06", "Ankara"));
        cities.add(new City("23", "Eskişehir"));

        for (City city : cities) {
            System.out.println(city);
        }
    }
}
