package src.main.Java1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by byang on 2018-07-04.
 */

/*
	<applet code = "BasicAppletExample" width = 200 height = 200>
	</applet>
*/
public class AppletBasic extends Applet {

    public void paint(Graphics g){
        //write text using drawString method of Graphics class
        g.drawString("This is my First Applet",20,100);
    }
}
