package Lesson1.HWLesson1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysFromBirthDateCalculator {
    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1986-08-21"));

    }

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate birthday = LocalDate.parse(birthDateString);
        LocalDate today = LocalDate.now();
        return birthday.until(today, ChronoUnit.DAYS);
    }
}

//daysFromBirthDate("1972-12-28") --->16609
////daysFromBirthDate("1986-08-21") --->11625