package src.main.Java0;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by byang on 2018-07-04.
 */
public class TorontoTime {
    public static void main(String[] args)
    {
        Calendar now = Calendar.getInstance();
        TimeZone timeZone = now.getTimeZone();
        //display current TimeZone using getDisplayName() method of TimeZone class
        System.out.println("Current/ur local TimeZone is : " + timeZone.getDisplayName());


        Calendar calVancouver = Calendar.getInstance();
        calVancouver.setTimeZone(TimeZone.getTimeZone("America/Vancouver"));
        System.out.println();
        System.out.println("Time in Vancouver: " + calVancouver.get(Calendar.HOUR_OF_DAY) + ":"
                + calVancouver.get(Calendar.MINUTE)+":"+calVancouver.get(Calendar.SECOND));
        System.out.println();


        Calendar calToronto = Calendar.getInstance();
        calToronto.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
      //  calToronto.setTimeZone(TimeZone.getTimeZone("America/Vancouver"));
                System.out.println();
        System.out.println("Time in Toronto: " + calToronto.get(Calendar.HOUR_OF_DAY) + ":"
                + calToronto.get(Calendar.MINUTE)+":"+calToronto.get(Calendar.SECOND));
        System.out.println();

        ZoneId.SHORT_IDS.keySet().
                stream().forEach(
                zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey))) ) );

    }
}
