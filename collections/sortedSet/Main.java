package collections.sortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        System.out.println();

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(342);
        sortedSet.add(5);
        sortedSet.add(1);
        sortedSet.add(0);
        sortedSet.add(5);

        Iterator<Integer> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("--------------");

        SortedSet<Student> students = new TreeSet<>();
        students.add(new Student(1001, "Ayşe"));
        students.add(new Student(1002, "Ahmet"));
        students.add(new Student(1004, "Berfin"));
        students.add(new Student(1003, "Emre"));

        System.out.println("Öğrenci sayısı : " + students.size());

        Iterator<Student> iterator2 = students.iterator();
        while (iterator2.hasNext()) {
            Student student = iterator2.next();
            System.out.println(student);
        }

        System.out.println("*** Foreach kullanarak : ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
