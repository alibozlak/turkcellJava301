package collections.set.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * interface NavigableSet extends SortedSet
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(5);
        navigableSet.add(8);
        navigableSet.add(8);
        navigableSet.add(9);
        navigableSet.add(12);
        navigableSet.add(7);

        System.out.println("Kümedeki eleman sayısı : " + navigableSet.size());

        for (Integer number : navigableSet) {
            System.out.println(number);
        }

        System.out.println("----------");

        System.out.println("6 veya 6'ya en yakın büyük sayı : " + navigableSet.ceiling(6));
        System.out.println("7 veya 7'ye en yakın büyük sayı : " + navigableSet.ceiling(7));

        System.out.println("10 veya 10'a en yakın küçük sayı : " + navigableSet.floor(10));
        System.out.println("9 veya 9'a en yakın küçük sayı : " + navigableSet.floor(9));
        System.out.println("3 veya 3'e en yakın küçük sayı : " + navigableSet.floor(3));

        System.out.println("8'den küçük, 8'e en yakın sayı : " + navigableSet.lower(8));
        
        System.out.println("8'den büyük, 8'e en yakın sayı : " + navigableSet.higher(8));
        
    }
}
