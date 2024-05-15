import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue May 14 13:54:45 EDT 2024
 */



/**
 * @author macsull
 */
public class createProfile extends JPanel {
    public createProfile() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        textPane1 = new JTextPane();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

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
                "[]" +
                "[]" +
                "[]"));

            //---- textPane1 ----
            textPane1.setText("Please create a new user profile");
            textPane1.setSelectedTextColor(new Color(0x6666ff));
            textPane1.setBackground(new Color(0x6666ff));
            panel1.add(textPane1, "cell 0 0");

            //---- label2 ----
            label2.setText("Username:");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() & ~Font.BOLD, label2.getFont().getSize() + 4f));
            panel1.add(label2, "cell 0 2");
            panel1.add(textField1, "cell 0 2");

            //---- button1 ----
            button1.setText("Create profile");
            panel1.add(button1, "cell 0 3 1 2");

            //---- button2 ----
            button2.setText("Back");
            panel1.add(button2, "cell 0 5");
        }
        add(panel1, "cell 0 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JTextPane textPane1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
