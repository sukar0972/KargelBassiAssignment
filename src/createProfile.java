import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue May 14 13:54:45 EDT 2024
 */



/**
 * @author macsull
 */
public class createProfile extends JPanel {
    public static JFrame frame;
    public createProfile(JFrame frame) {
        createProfile.frame = frame;
        initComponents();
    }

    private void profileCreate(ActionEvent e) {
        // TODO add your code here
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src/userData.txt", true)));
            writer.println(userNameInput.getText());
            writer.close();
            labelStatus.setText("You may login using this user.");
        } catch (IOException er) {
            System.err.println("Error writing to file: " + er.getMessage());
        }
    }

    public static String validUsername(String name) {

        return null;
    }


    private void back(ActionEvent e) {
        // TODO add your code here
        frame.setContentPane(new welcomePage());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textPane1 = new JTextPane();
        panel1 = new JPanel();
        labelStatus = new JLabel();
        label2 = new JLabel();
        userNameInput = new JTextField();
        label1 = new JLabel();
        buttonProfileCreate = new JButton();
        buttonBack = new JButton();

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

        //---- textPane1 ----
        textPane1.setText("Please create a new user profile");
        textPane1.setSelectedTextColor(new Color(0x6666ff));
        textPane1.setBackground(new Color(0xf2f2f2));
        add(textPane1, "cell 1 0");

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x6666ff));
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- labelStatus ----
            labelStatus.setForeground(Color.lightGray);
            panel1.add(labelStatus, "cell 1 1");

            //---- label2 ----
            label2.setText("Username:");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() & ~Font.BOLD, label2.getFont().getSize() + 4f));
            panel1.add(label2, "cell 0 2");
            panel1.add(userNameInput, "cell 1 2");

            //---- label1 ----
            label1.setText("                   ");
            panel1.add(label1, "cell 4 2");

            //---- buttonProfileCreate ----
            buttonProfileCreate.setText("Create profile");
            buttonProfileCreate.addActionListener(e -> profileCreate(e));
            panel1.add(buttonProfileCreate, "cell 1 3 1 2");

            //---- buttonBack ----
            buttonBack.setText("Back");
            buttonBack.addActionListener(e -> back(e));
            panel1.add(buttonBack, "cell 1 5");
        }
        add(panel1, "cell 0 1 2 3");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextPane textPane1;
    private JPanel panel1;
    private JLabel labelStatus;
    private JLabel label2;
    private JTextField userNameInput;
    private JLabel label1;
    private JButton buttonProfileCreate;
    private JButton buttonBack;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
