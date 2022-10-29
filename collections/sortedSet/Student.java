package collections.sortedSet;

public class Student implements Comparable<Student> {
    
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
    
    public Student() {
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Öğrenci ismi : " + getName() + ", Öğrenci no : " + getNo();
    }

    @Override
    public int compareTo(Student o) {   // <-- SortedSet bu compareTo metodundan dönen değere göre sıralama yapar.
        return this.getNo() - o.getNo();    // <-- Buranın sonucu 0 ise o nesneyi sete almaz.
    }
    
}
