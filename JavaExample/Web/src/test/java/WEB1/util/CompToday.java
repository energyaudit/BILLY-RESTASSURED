package WEB1.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompToday {

    public static  String ComTd(String fromDateFormat,String Todate) throws ParseException
    {
        DiffFormatDateCmp obj = new DiffFormatDateCmp();

        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        System.out.println("Today : " + today);
        String str= obj.datecheckcmp("dd/MM/yyyy", fromDateFormat,today,Todate);
        System.out.println(str);
        return str;
    }
}
