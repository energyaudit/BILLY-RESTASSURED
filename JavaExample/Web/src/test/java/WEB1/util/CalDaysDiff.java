package WEB1.util;

import org.joda.time.Duration;
import org.joda.time.Interval;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalDaysDiff {
    public static  long Diff;

    public static long calDaysDiffer(String DateFormat,String fromDate,String toDate) throws ParseException {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
            Date date1 = sdf.parse(fromDate);
            Date date2 = sdf.parse(toDate);

            System.out.println("date1 : " + sdf.format(date1));
            System.out.println("date2 : " + sdf.format(date2));

            Interval interval = new Interval(date1.getTime(), date2.getTime());
            Duration period = interval.toDuration();
             Diff = period.getStandardDays();
            System.out.println(Diff);

        } catch (ParseException e) {
            throw new ParseException("Please input correct date format",0);

        }
        return Diff;
    }
}

