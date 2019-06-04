package src.main.Java1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by byang on 2018-07-04.
 */

/*
<applet code="HandleActionEventExample" width=200 height=200>
</applet>
*/

public class AwtButton extends Applet implements ActionListener {

    String actionMessage="";

    public void init(){
        //create Buttons
        Button Button1 = new Button("Ok");
        Button Button2 = new Button("Cancel");

        //add Buttons
        add(Button1);
        add(Button2);

        //set action listeners for buttons
        Button1.addActionListener(this);
        Button2.addActionListener(this);
    }

    public void paint(Graphics g){
        g.drawString(actionMessage,10,50);
    }

    public void actionPerformed(ActionEvent ae){

		/*
		 * Get the action command using
		 * String getActionCommand() method.
		 */

        String action = ae.getActionCommand();

        if(action.equals("Ok"))
            actionMessage = "Ok Button Pressed";
        else if(action.equals("Cancel"))
            actionMessage = "Cancel Button Pressed";

        repaint();
    }
}
