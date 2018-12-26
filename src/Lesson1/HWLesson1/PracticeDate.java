package Lesson1.HWLesson1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PracticeDate {
    public static void main(String[] args) {
        LocalDate dateToday = LocalDate.now();
        System.out.println(dateToday);
        System.out.println();

        LocalDate birhgt = LocalDate.of(1986, Month.AUGUST, 21);
        System.out.println(birhgt);
        System.out.println();

        LocalDate dateFrom = LocalDate.ofEpochDay(365);
        System.out.println(dateFrom);

        LocalDate a = LocalDate.parse("1986-04-12");
        System.out.println(a.toEpochDay());

        Period c = Period.between(birhgt, dateToday );
        System.out.println(c.toTotalMonths());

        System.out.println(birhgt.until(dateToday, ChronoUnit.DAYS));

        String s = "2015-06-15";
     //   LocalDate b;
  //      System.out.println(isSupported(a));
    }
}
