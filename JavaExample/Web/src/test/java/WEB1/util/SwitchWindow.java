package WEB1.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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