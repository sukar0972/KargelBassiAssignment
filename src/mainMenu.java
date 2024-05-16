import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 15 20:54:35 EDT 2024
 */



/**
 * @author macsull
 */
public class mainMenu extends JPanel {
    public mainMenu() {
        initComponents();
    }

    private void login(ActionEvent e) {
        // TODO add your code here
    }

    private void studyNote(ActionEvent e) {
        // TODO add your code here
    }

    private void startQuiz(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x6666ff));
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]"));
        }
        add(panel1, "cell 0 0 2 3");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
