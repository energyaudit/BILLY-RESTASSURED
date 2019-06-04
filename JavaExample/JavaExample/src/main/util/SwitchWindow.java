package src.main.util;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SwitchWindow {

    public static WebDriver  inputStr(WebDriver dr, int bk) throws Exception {
       try {

        Set<String> winSet = dr.getWindowHandles();//get set to know how to go back
        System.out.println(winSet.toString());
        List<String> winList = new ArrayList<String>(winSet);
        String newTab = winList.get(winList.size() - bk);//last windowhandle
        System.out.println("winList: "+winList.size());
        System.out.println(newTab);
        dr.switchTo().window(newTab);

        } catch (Exception e) {
            System.out.println(e);
        }
           return dr;
    }
}