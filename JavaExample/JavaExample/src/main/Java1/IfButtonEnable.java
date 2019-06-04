package src.main.Java1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by byang on 2018-07-04.
 */

/*
<applet code="DetermineIfButtonEnabled" width=100 height=200>
</applet>
*/

public class IfButtonEnable extends Applet {

    boolean isButton1Enabled;
    boolean isButton2Enabled;

    public void init(){
        //create Buttons
        Button Button1 = new Button("Ok");
        Button Button2 = new Button("Cancel");

        //add Buttons
        add(Button1);
        add(Button2);

        Button1.setEnabled(false);

		/*
		 * To determine if the Button is enabled or not use
		 * boolean isEnabled() method.
		 */

        isButton1Enabled = Button1.isEnabled();
        isButton2Enabled = Button2.isEnabled();

    }

    public void paint(Graphics g){
        g.drawString("Is Button 1 enabled? " + isButton1Enabled, 10,50);
        g.drawString("Is Button 2 enabled? " + isButton2Enabled, 10,70);
    }

}