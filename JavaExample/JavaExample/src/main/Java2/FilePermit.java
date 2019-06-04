package src.main.Java2;

/**
 * Created by byang on 2018-06-11.
 */


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class FilePermit {
    public static void main(String args[]){
        File file = new File("C:\\QA\\TEST\\TestcasesZephyr.docx");
        System.out.println("Current file permissions:");
        System.out.println("Can Execute? "+file.canExecute());
        System.out.println("Can Read? "+file.canRead());
        System.out.println("Can Write? "+file.canWrite());
        file.setExecutable(false);
        file.setReadable(false);
        file.setWritable(false);
        System.out.println("Now file permissions:");
        System.out.println("Can Execute? "+file.canExecute());
        System.out.println("Can Read? "+file.canRead());
        System.out.println("Can Write? "+file.canWrite());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));

        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));

        if(file.isHidden()){
            System.out.println("The specified file is hidden");
        }else{
            System.out.println("The specified file is not hidden");
        }



    }
}