package src.main.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by byang on 2018-09-18.
 */


public class OutPutResult {

    public static void inputStr(String Tstnam)  {
     String TestCaseName=Tstnam;
        try
        {
            FileWriter w = new FileWriter(PropertyUtil.getMessageForApplication(TestConstants.REPORTFILE),true);
            BufferedWriter out = new BufferedWriter(w);
            out.newLine();
            out.write(TestCaseName+" SUCCESS");
            out.newLine();
            out.write("Test date and time is:");
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            //get current date time with Date()
            Date date = new Date();
            // Now format the date
            String date1= dateFormat.format(date);
            // Print the Date
            System.out.println("Test date and time is " +date1);
            out.write(date1);
            out.flush();
            out.close();
        }

        catch(Exception e)
        {
            System.out.println(e);

        }

    }
    public static void main(String[] args){
        OutPutResult outR = new OutPutResult();
        outR.inputStr("TestCase1");
            }
}





