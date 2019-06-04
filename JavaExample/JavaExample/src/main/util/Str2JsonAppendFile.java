package src.main.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Str2JsonAppendFile {
    public static void inputStr(String JsonStr, String filepath){
        try {
//            FileWriter writer = new FileWriter(filepath);
//            writer.write(JsonStr);
//            writer.close();
            FileWriter w = new FileWriter(filepath,true);
            BufferedWriter out = new BufferedWriter(w);
            out.newLine();
            out.write(JsonStr);
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

        } catch (IOException e) {
            System.out.println("exception " + e.getMessage());
            e.printStackTrace();
        }

    }
}
