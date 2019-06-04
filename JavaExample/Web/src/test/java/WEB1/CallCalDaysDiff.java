package WEB1;

import WEB1.util.*;

import java.text.ParseException;


public class CallCalDaysDiff {
    private static long daysDiff;
    private static boolean DffD;
    public static void main(String[] args){
        CalDaysDiff ccd= new CalDaysDiff();
        try{ long daysDiff0=ccd.calDaysDiffer("yyyy-MM-dd","2009-12-31","2010-01-31");
            System.out.println(daysDiff0);
        }
        catch(ParseException e)
        {}


    //    long daysDiff=ccd.calDaysDiffer("yyyy-MM-dd","2009-12-31","2010-01-31");
        try{ long daysDiff1=ccd.calDaysDiffer("yyyy/MM/dd","2009/12/30","2010/01/31");
        }
        catch(ParseException e)
        {System.out.println(e);}

        VeriDaysDiffN vdn=new VeriDaysDiffN();
        DffD= vdn.inputPara("dd/MM/yyyy","30/5/2019",30);
        System.out.println(DffD);
    }
}
