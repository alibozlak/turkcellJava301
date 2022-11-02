package java8.functionalInterfaceLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        System.out.println();

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci(3, "Ali Can", 80));
        ogrenciler.add(new Ogrenci(2, "Seyhan Çalışkan", 90));
        ogrenciler.add(new Ogrenci(1, "Ertuğ Yılmaz", 50));
        ogrenciler.add(new Ogrenci(4, "Göktuğ Sancak", 70));

        ogrenciler.forEach(ogrenci -> System.out.println(ogrenci));
        System.out.println("--------------");

        // with Anonimus Class :
        Collections.sort(ogrenciler, new Comparator<Ogrenci>() {
           @Override
           public int compare(Ogrenci o1, Ogrenci o2) {
            return o1.getId() - o2.getId();
           } 
        });

        ogrenciler.forEach(ogrenci -> System.out.println(ogrenci));
        System.out.println("--------------");

        // with Lambda expressions :
        Collections.sort(ogrenciler, (o1, o2) -> o1.getNotOrtalamasi() - o2.getNotOrtalamasi());
        ogrenciler.forEach(ogrenci -> System.out.println(ogrenci));
    }
}
