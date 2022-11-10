package java8.dateTime1;

import java.time.LocalDate;
// import java.time.temporal.ChronoUnit;

class Main {
    public static void main(String[] args) {
        System.out.println();

        // Added java.time package with Java 8
        
        // LocalDate :
        LocalDate localDate = LocalDate.now();
        System.out.println("Bugün : " + localDate);  // 2022-11-02

        LocalDate localDate2 = LocalDate.of(1990, 6, 22);
        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.parse("2022-05-28");
        System.out.println(localDate3);

        // LocalDate tomorrow = localDate.plus(1, ChronoUnit.DAYS);
        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println("Yarın : " + tomorrow);

        LocalDate oneMonthAgo = localDate.minusMonths(1);
        System.out.println("Bir ay önce : " + oneMonthAgo);

        System.out.println("Bu gün günlerden ne : " + localDate.getDayOfWeek());
        System.out.println("Bügün ayın kaçı : " + localDate.getDayOfMonth());
    }
}
