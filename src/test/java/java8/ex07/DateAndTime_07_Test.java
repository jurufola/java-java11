package java8.ex07;

import org.junit.Test;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

    @Test
    public void test_date_to_localdate() throws Exception {

        // TODO Créer une date Java 1 (12/02/2017)
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR, 2017);
        calendar.set(calendar.MONTH, 1);
        calendar.set(calendar.DAY_OF_MONTH, 12);
        calendar.set(calendar.HOUR_OF_DAY, 0);
        calendar.set(calendar.MINUTE, 0);
        calendar.set(calendar.SECOND, 0);
        date = calendar.getTime();
        // TODO transformer la date en Instant
        Instant i = date.toInstant();
        // TODO transformer la date en LocalDate

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(i, ZoneId.systemDefault());
        LocalDate result = zonedDateTime.toLocalDate();


        // TODO valoriser les différentes variables afin de rendre le test passant

        assertThat(result.getYear(), is(2017));
        assertThat(result.getMonth(), is(Month.FEBRUARY));
        assertThat(result.getDayOfMonth(), is(12));


    }
}
