package java8.lambda2;

class Lambda2 {
    public static void main(String[] args) {
        System.out.println();

        Merhaba merhaba = () -> "Merhaba Dunya";
        System.out.println(merhaba.selam());

        Merhaba2 merhaba2 = (s) -> "Merhaba " + s;
        System.out.println(merhaba2.selam("Ali"));
    }
}
