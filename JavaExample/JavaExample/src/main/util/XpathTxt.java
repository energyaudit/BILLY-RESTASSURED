package src.main.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class XpathTxt {
    public static boolean exist;

    public static boolean  inputStr(WebDriver dr,String path, String ept) throws Exception {
//        try {

            List<WebElement> webElements = dr.findElements(By.xpath(path));//Put whole second column of table to
            //list webElements,then check if Birthday is inside

            String expect = ept;
            System.out.println(expect);
            boolean exist = false;
            for (WebElement element : webElements) {
                System.out.println(element.getText());
                if (expect.equals(element.getText())) {
                    exist = true;
                }
            }

//        } catch (Exception e) {
//            System.out.println(e);
//        }
        System.out.println(exist);
        return exist;
    }
}