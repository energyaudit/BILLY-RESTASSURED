package src.main.Java1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by byang on 2018-07-04.
 */

/*
<applet code="CreateCheckBox" width=200 height=200>
</applet>
*/

public class AWTCheckbox extends Applet {

    public void init(){

		/* To create a checkbox use
		 * Checkbox() constructor.*/
        Checkbox checkBox1 = new Checkbox();

		/*Set Checkbox caption or label using void setLabel(String text)
		 * method of AWT Checkbox class. */

        checkBox1.setLabel("My Checkbox 1");

		/* To create checkbox with the caption use CheckBox(String text) constructor of AWT Checkbox class. */

        Checkbox checkbox2 = new Checkbox("My Checkbox 2");

        //add checkboxes using add method
        add(checkBox1);
        add(checkbox2);
    }
}