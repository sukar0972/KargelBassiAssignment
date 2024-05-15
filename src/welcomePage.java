import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue May 14 13:39:04 EDT 2024
 */



/**
 * @author macsull
 */
public class welcomePage extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //construct JFrame
        frame.setContentPane(new welcomePage()); //create a new instance of this class and set the contents of the jframe to it
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set size of frame
        frame.setSize(385, 280);
    }
    public welcomePage() {
        initComponents();
    }

    private void login(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        panel1 = new JPanel();
        textPane1 = new JTextPane();
        label2 = new JLabel();
        textField1 = new JTextField();
        buttonLogin = new JButton();
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
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Welcome to the Helpy Helper Portal!");
        label1.setFont(label1.getFont().deriveFont(Font.BOLD, label1.getFont().getSize() + 2f));
        add(label1, "cell 0 0");

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
            textPane1.setText("In order to save your results, we need you to login, or create a new profile");
            textPane1.setSelectedTextColor(new Color(0x6666ff));
            textPane1.setBackground(new Color(0x6666ff));
            panel1.add(textPane1, "cell 0 0");

            //---- label2 ----
            label2.setText("Username:");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() & ~Font.BOLD, label2.getFont().getSize() + 4f));
            panel1.add(label2, "cell 0 2");
            panel1.add(textField1, "cell 0 2");

            //---- buttonLogin ----
            buttonLogin.setText("Login");
            buttonLogin.addActionListener(e -> login(e));
            panel1.add(buttonLogin, "cell 0 3 1 2");

            //---- button2 ----
            button2.setText("Create a profile");
            panel1.add(button2, "cell 0 5");
        }
        add(panel1, "cell 0 1 2 3");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JPanel panel1;
    private JTextPane textPane1;
    private JLabel label2;
    private JTextField textField1;
    private JButton buttonLogin;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
