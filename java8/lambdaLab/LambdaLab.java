package java8.lambdaLab;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java8.lambdaLab.Kisi.Cinsiyet;

class LambdaLab {
    public static void main(String[] args) {
        System.out.println();

        Kisi kisi1 = new Kisi("Can", LocalDate.parse("1992-01-20"), "can@example.com", Cinsiyet.ERKEK);
        Kisi kisi2 = new Kisi("Seyhan", LocalDate.parse("1995-01-02"), "seyhan@example.com", Cinsiyet.KADIN);
        Kisi kisi3 = new Kisi("Tuğrul", LocalDate.parse("1999-01-31"), "tugrul@example.com", Cinsiyet.ERKEK);
        
        System.out.println(kisi1);
        System.out.println(kisi2);
        System.out.println(kisi3);
        System.out.println("------------");

        ArrayList<Kisi> people = new ArrayList<>();
        people.add(kisi1);
        people.add(kisi2);
        people.add(kisi3);

        cinsiyeteGoreFiltrele(people, Cinsiyet.ERKEK);
        System.out.println("-------------");

        // Anonim class kullanarak :
        KisiFiltresi kisiFiltresi = new KisiFiltresi() {
            @Override
            public boolean filtrele(Kisi kisi) {
                return kisi.getYas() > 15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
            }
        };

        kisiFiltrele(people, kisiFiltresi);
        System.out.println("----------------");

        // Lambda kullanarak :
        KisiFiltresi kisiFiltresi2 = (kisi) -> kisi.getYas() > 15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
        kisiFiltrele(people, kisiFiltresi2);
    }

    public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getCinsiyet().equals(cinsiyet)) {
                System.out.println(kisi);
            }
        }
    }

    public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltresi) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisiFiltresi.filtrele(kisi)) {
                System.out.println(kisi);
            }
        }
    }
}
