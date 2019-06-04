package src.main.Java0;

/**
 * Created by byang on 2018-09-13.
 */

import java.util.Calendar;

public class CalendarExp {

    public static void main(String[] args) {

        //create Calendar instance
        Calendar now = Calendar.getInstance();
        String[] strDays = new String[]{
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thusday",
                "Friday",
                "Saturday"        };

        //Day_OF_WEEK starts from 1 while array index starts from 0
        System.out.println("Current day is : " +
                        strDays[now.get(Calendar.DAY_OF_WEEK) - 1]        );

        String[] strMonths = new String[]{
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };

        System.out.println("Current month is : " +
                        strMonths[now.get(Calendar.MONTH)]
        );

        System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1)
                + "-"+ now.get(Calendar.DATE)+ "-"+ now.get(Calendar.YEAR));

        System.out.println("Current week of month is : " +
                now.get(Calendar.WEEK_OF_MONTH));

        System.out.println("Current week of year is : " +
                now.get(Calendar.WEEK_OF_YEAR));

        //add months to current date using Calendar.add method
        now.add(Calendar.MONTH,10);

        System.out.println("date after 10 months : " + (now.get(Calendar.MONTH) + 1)
                + "-"+ now.get(Calendar.DATE)+ "-"+ now.get(Calendar.YEAR));
        System.out.println("The corresponding day is : " +
                strDays[now.get(Calendar.DAY_OF_WEEK) - 1]        );



        //substract months from current date using Calendar.add method
        now = Calendar.getInstance();
        now.add(Calendar.MONTH, -5);

        System.out.println("date before 5 months : " + (now.get(Calendar.MONTH) + 1)
                + "-"+ now.get(Calendar.DATE)+ "-"+ now.get(Calendar.YEAR));
        System.out.println("The corresponding day is : " +
                strDays[now.get(Calendar.DAY_OF_WEEK) - 1]        );

        now.add(Calendar.HOUR,10);

        System.out.println("New time after adding 10 hours : "
                + now.get(Calendar.HOUR_OF_DAY)
                + ":"
                + now.get(Calendar.MINUTE)
                + ":"
                + now.get(Calendar.SECOND));











    }
}