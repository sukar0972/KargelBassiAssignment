import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //construct JFrame
        frame.setContentPane(new welcomePage()); //create a new instance of this class and set the contents of the jframe to it
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size of frame
        frame.setSize(385, 280);
    }



}
