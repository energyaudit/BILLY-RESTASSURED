package WEB1.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import WEB1.util.CalDaysDiff;

public class VeriDaysDiffN {
    private static int diff;

    public static boolean inputPara(String DateFormat,String Todate,Integer ExpDiffN){
        DiffFormatDateCmp obj = new DiffFormatDateCmp();

        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
        java.text.DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        System.out.println("Today : " + today);

        CalDaysDiff cdd=new CalDaysDiff();
     try{  diff=(int) cdd.calDaysDiffer(DateFormat,today,Todate);}
     catch(ParseException e)
     {  System.out.println(e);}

       if(diff >=ExpDiffN){    return true;       }
       else       {return false;}
   }
}
