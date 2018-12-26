package Lesson7.Task3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        Filter a = new Filter();
        List<Integer> ages = Arrays.asList(36, 28, 12, 25, 43);
        List<Integer> agesBetween20And30 = Filter.filter(ages, new IntegerPredicate(20, 30));
        System.out.println(agesBetween20And30);

        List<LocalDate> dates = Arrays.asList(LocalDate.of(1995, 8, 4),
                LocalDate.of(2004, 10, 3), LocalDate.of(1986, 3, 15),
                LocalDate.of(2001, 2, 26));
        List<LocalDate> birthDaysIn21thCentury = Filter.filter(dates, new DateAfterPredicate(LocalDate.of(1999, 12, 31)));
        System.out.println(birthDaysIn21thCentury);

    }
}

//[28, 25]
//[2004-10-03, 2001-02-26]
