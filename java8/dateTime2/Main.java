package java8.dateTime2;

import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        System.out.println();

        LocalTime hourAndMinute = LocalTime.now();
        System.out.println("Şimdiki saat : " + hourAndMinute);

        LocalTime localTime = LocalTime.parse("23:56");
        System.out.println(localTime);

        LocalTime localTime2 = LocalTime.of(23, 56);
        System.out.println(localTime2);

        LocalTime localTime3 = LocalTime.parse("22:46").plusHours(1);
        System.out.println("1 saat sonra : " + localTime3);

        LocalTime localTime4 = LocalTime.parse("22:46").plusMinutes(10);
        System.out.println("10 dakika sonra : " + localTime4);

        LocalTime localTime5 = LocalTime.parse("22:46").minusHours(2);
        System.out.println("2 saat önce : " + localTime5);

        LocalTime localTime6 = LocalTime.parse("22:46").minusMinutes(40);
        System.out.println("40 dk önce : " + localTime6);
    }
}
