package src.main.Java2;

/**
 * Created by byang on 2018-06-14.
 */

import java.awt.*;
/* We have extended the Frame class here,
 * thus our class  would behave like a Frame
 */
class awtFr extends Frame {
    awtFr() {
        Button b = new Button("Button!!");

        // setting button position on screen
        b.setBounds(50, 50, 50, 50);

        //adding button into frame
        add(b);

        //Setting Frame width and height
        setSize(500, 300);

        //Setting the title of Frame
        setTitle("This is my First AWT example");

        //Setting the layout for the Frame
        setLayout(new FlowLayout());

        /* By default frame is not visible so* we are setting the visibility to true to make it visible.
         */
        setVisible(true);


    }
}
//method 2
class Example2 {
    Example2() {
        //Creating Frame
        Frame fr = new Frame();

        //Creating a label
        Label lb = new Label("UserId: ");

        //adding label to the frame
        fr.add(lb);

        //Creating Text Field
        TextField t = new TextField();

        //adding text field to the frame
        fr.add(t);

        //setting frame size
        fr.setSize(500, 300);

        //Setting the layout for the Frame
        fr.setLayout(new FlowLayout());

        fr.setVisible(true);
    }



}
public class awtExp {
    public static void main(String args[]) {
        // Creating the instance of Frame
        awtFr fr = new awtFr();
        Example2 ex = new Example2();
    }
}
