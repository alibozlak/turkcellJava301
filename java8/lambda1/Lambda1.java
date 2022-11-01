package java8.lambda1;

class Lambda1 {
    public static void main(String[] args) {
        System.out.println();

        // Anonim class kullanarak :
        SayiOlustur sayiOlustur = new SayiOlustur() {
            @Override
            public double olustur() {
                return 15.4;
            }
        };
        System.out.println(sayiOlustur.olustur());
        System.out.println("-----------");

        // Lambda kullanarak :
        SayiOlustur sayiOlustur2 = () -> 15.6;
        System.out.println(sayiOlustur2.olustur());
    }
}
