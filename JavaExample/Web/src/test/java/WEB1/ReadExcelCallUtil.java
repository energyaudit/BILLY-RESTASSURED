package WEB1;

import WEB1.util.ReadExcel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class ReadExcelCallUtil {
    public static void main(String... strings) throws IOException, InvalidFormatException {


        ReadExcel objExcelFile = new ReadExcel();
        String filePath = "C:\\QA\\SOAPUI\\source.xls";
        objExcelFile.readExcel(filePath);
        String filePath1 = "C:\\QA\\SOAPUI\\source.xlsx";
        objExcelFile.readExcel(filePath1);
    }
}
