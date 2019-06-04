package WEB1;

import WEB1.util.DiffFormatDateCmp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CallDiffFormCmp {

    public static void main(String args[])throws ParseException
    {
        DiffFormatDateCmp obj = new DiffFormatDateCmp();

        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        System.out.println("Today : " + today);
        String str= obj.datecheckcmp("dd/MM/yyyy", "dd/MM/yyyy", "27/12/2018",today);
        System.out.println(str);
    }
}
