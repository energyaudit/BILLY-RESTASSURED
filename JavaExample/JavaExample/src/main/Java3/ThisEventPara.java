package src.main.Java3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by byang on 2018-11-23.
 */

public class ThisEventPara implements ActionListener {
    JButton button;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThisEventPara gui=new ThisEventPara();
        gui.go();
    }

    public void go()
    {
        JFrame frame=new JFrame();
        button=new JButton();
        frame.getContentPane().add(button);
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        button.setText("I've been clicked");
    }
}